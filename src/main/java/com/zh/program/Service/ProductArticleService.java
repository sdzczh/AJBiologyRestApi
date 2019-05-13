package com.zh.program.Service;

import com.zh.program.Entrty.ProductArticle;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:20:05
 **/ 
public interface ProductArticleService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int insert(ProductArticle record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int insertSelective(ProductArticle record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int updateByPrimaryKey(ProductArticle record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int updateByPrimaryKeySelective(ProductArticle record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    ProductArticle selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    List<ProductArticle> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    List<ProductArticle> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:20:05
     **/ 
    int selectCount(Map<Object, Object> param);

    ProductArticle selectByArticleId(Integer id);
}