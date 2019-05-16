package com.zh.program.Service;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Entrty.Sysparam;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-15 16:10:02
 **/ 
public interface SysparamService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int insert(Sysparam record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int insertSelective(Sysparam record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int updateByPrimaryKey(Sysparam record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int updateByPrimaryKeySelective(Sysparam record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    Sysparam selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    List<Sysparam> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    List<Sysparam> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:10:02
     **/ 
    int selectCount(Map<Object, Object> param);

    /**
     * 根据key查询
     * @param key
     * @return
     */
    Sysparam selectByKey(String key) throws Exception;

    /**
     * 首页获取value
     * @return
     */
    JSONObject getIndexSysparam();
    /**
     * 关于页获取value
     * @return
     */
    JSONObject getAboutSysparam();

    /**
     * 传入Keys列表查询
     * @param keys
     *@return
     */
    JSONObject getAboutSysparam(List<String> keys) throws Exception;
}