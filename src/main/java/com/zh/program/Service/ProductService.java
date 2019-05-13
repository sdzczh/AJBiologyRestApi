package com.zh.program.Service;

import com.zh.program.Entrty.Product;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:18:57
 **/ 
public interface ProductService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int insert(Product record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int insertSelective(Product record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int updateByPrimaryKey(Product record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int updateByPrimaryKeySelective(Product record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    Product selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    List<Product> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    List<Product> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 16:18:57
     **/ 
    int selectCount(Map<Object, Object> param);
}