package com.zh.program.Service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.enums.RedisKey;
import com.zh.program.Common.enums.SysparamsKey;
import com.zh.program.Common.utils.RedisUtil;
import com.zh.program.Common.utils.StrUtils;
import com.zh.program.Dao.SysparamMapper;
import com.zh.program.Entrty.Sysparam;
import com.zh.program.Service.SysparamService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author: autogeneration
 * @date: 2019-05-15 16:10:02
 **/
@Service("sysparamService")
public class SysparamServiceImpl implements SysparamService {
    @Resource
    private SysparamMapper sysparamMapper;
    @Resource
    private RedisTemplate<String, String> redis;

    private static final Logger logger = LoggerFactory.getLogger(SysparamServiceImpl.class);

    @Override
    public int insert(Sysparam record) {
        return this.sysparamMapper.insert(record);
    }

    @Override
    public int insertSelective(Sysparam record) {
        return this.sysparamMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sysparam record) {
        return this.sysparamMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Sysparam record) {
        return this.sysparamMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.sysparamMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Sysparam selectByPrimaryKey(Integer id) {
        return this.sysparamMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Sysparam> selectAll(Map<Object, Object> param) {
        return this.sysparamMapper.selectAll(param);
    }

    @Override
    public List<Sysparam> selectPaging(Map<Object, Object> param) {
        return this.sysparamMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.sysparamMapper.selectCount(param);
    }

    @Override
    public Sysparam selectByKey(String key) throws Exception {
        String redisKey = RedisKey.REDIS_INDEX + "key";
        Sysparam sysparam = RedisUtil.searchStringObj(redis, redisKey, Sysparam.class);
        if(sysparam == null) {
            Map<Object, Object> map = new HashMap<>();
            map.put("keyName", key);
            List<Sysparam> sysparamList = this.sysparamMapper.selectAll(map);
            if(sysparamList.size() == 0){
                throw new Exception("系统参数错误");
            }else{
                sysparam = sysparamList.get(0);
                RedisUtil.addStringObj(redis, redisKey, sysparam);
            }
        }
        return sysparam;
    }

    @Override
    public JSONObject getIndexSysparam() {
        List<String> lists = new LinkedList<>();
        lists.add(SysparamsKey.INDEX_BANNER_TITLE);
        lists.add(SysparamsKey.INDEX_BANNER_DESCRIBE);
        lists.add(SysparamsKey.INDEX_COMPANY_ABOUT);
        lists.add(SysparamsKey.COMPANY_PHONE);
        lists.add(SysparamsKey.COMPANY_EMAIL);
        lists.add(SysparamsKey.COMPANY_ADDRESS);
        lists.add(SysparamsKey.COMPANY_SINCE);
        lists.add(SysparamsKey.COMPANY_AREA);
        lists.add(SysparamsKey.COMPANY_MARKET_VALUE);
        try {
            return getAboutSysparam(lists);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public JSONObject getAboutSysparam() {
        List<String> lists = new LinkedList<>();
        lists.add(SysparamsKey.ABOUT_TITLE_1);
        lists.add(SysparamsKey.ABOUT_TITLE_2);
        lists.add(SysparamsKey.ABOUT_TITLE_3);
        lists.add(SysparamsKey.ABOUT_TITLE_4);
        lists.add(SysparamsKey.ABOUT_TITLE_5);
        lists.add(SysparamsKey.ABOUT_TITLE_6);
        lists.add(SysparamsKey.ABOUT_CEO_CONTENT);
        lists.add(SysparamsKey.ABOUT_ENTERPRISE_INFO);
        try {
            return getAboutSysparam(lists);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public JSONObject getAboutSysparam(List<String> list) throws Exception {
        JSONObject jsonObject = new JSONObject();
        for(String keys : list){
            String value = selectByKey(keys).getKeyValue();
            jsonObject.put(keys, value);
        }
        return jsonObject;
    }
}