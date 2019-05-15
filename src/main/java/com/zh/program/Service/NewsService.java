package com.zh.program.Service;

import com.zh.program.Entrty.News;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-15 16:28:09
 **/ 
public interface NewsService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int insert(News record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int insertSelective(News record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int updateByPrimaryKey(News record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int updateByPrimaryKeySelective(News record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    News selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    List<News> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    List<News> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-15 16:28:09
     **/ 
    int selectCount(Map<Object, Object> param);

    /**
     * 首页新闻列表
     * @return
     */
    List<News> getIndxList();
}