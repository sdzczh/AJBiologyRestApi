package com.zh.program.Dao;

import com.zh.program.Entrty.Product;
import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);

    int updateByPrimaryKey(Product record);

    int updateByPrimaryKeySelective(Product record);

    int deleteByPrimaryKey(Integer id);

    Product selectByPrimaryKey(Integer id);

    List<Product> selectAll(Map<Object, Object> param);

    List<Product> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}