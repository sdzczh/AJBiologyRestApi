package com.zh.program.Service;

import com.zh.program.Entrty.CompanyTimeline;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:09:03
 **/ 
public interface CompanyTimelineService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int insert(CompanyTimeline record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int insertSelective(CompanyTimeline record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int updateByPrimaryKey(CompanyTimeline record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int updateByPrimaryKeySelective(CompanyTimeline record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    CompanyTimeline selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    List<CompanyTimeline> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    List<CompanyTimeline> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:09:03
     **/ 
    int selectCount(Map<Object, Object> param);
}