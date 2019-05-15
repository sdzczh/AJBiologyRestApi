package com.zh.program.Service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.enums.SysparamsKey;
import com.zh.program.Dao.SysparamMapper;
import com.zh.program.Entrty.Sysparam;
import com.zh.program.Service.SysparamService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public Sysparam selectByKey(String key) {
        Map<Object, Object> map = new HashMap<>();
        map.put("keyName", key);
        List<Sysparam> sysparamList = this.sysparamMapper.selectAll(map);
        return sysparamList.size() == 0 ? null : sysparamList.get(0);
    }

    @Override
    public JSONObject getIndexSysparam() {
        String bannerTitle = selectByKey(SysparamsKey.INDEX_BANNER_TITLE).getKeyValue();
        String bannerDescribe = selectByKey(SysparamsKey.INDEX_BANNER_DESCRIBE).getKeyValue();
        String companyAbout = selectByKey(SysparamsKey.INDEX_COMPANY_ABOUT).getKeyValue();
        String phone = selectByKey(SysparamsKey.COMPANY_PHONE).getKeyValue();
        String email = selectByKey(SysparamsKey.COMPANY_EMAIL).getKeyValue();
        String address = selectByKey(SysparamsKey.COMPANY_ADDRESS).getKeyValue();
        String since = selectByKey(SysparamsKey.COMPANY_SINCE).getKeyValue();
        String area = selectByKey(SysparamsKey.COMPANY_AREA).getKeyValue();
        String marketValue = selectByKey(SysparamsKey.COMPANY_MARKET_VALUE).getKeyValue();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bannerTitle", bannerTitle);
        jsonObject.put("bannerDescribe", bannerDescribe);
        jsonObject.put("companyAbout", companyAbout);
        jsonObject.put("phone", phone);
        jsonObject.put("email", email);
        jsonObject.put("address", address);
        jsonObject.put("since", since);
        jsonObject.put("marketValue", marketValue);
        jsonObject.put("area", area);
        return jsonObject;
    }
}