package com.zh.program.Service;

import com.zh.program.Entrty.Quality;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:41:58
 **/ 
public interface QualityService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int insert(Quality record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int insertSelective(Quality record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int updateByPrimaryKey(Quality record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int updateByPrimaryKeySelective(Quality record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    Quality selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    List<Quality> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    List<Quality> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:41:58
     **/ 
    int selectCount(Map<Object, Object> param);
}