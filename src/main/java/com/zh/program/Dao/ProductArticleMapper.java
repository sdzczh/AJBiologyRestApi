package com.zh.program.Dao;

import com.zh.program.Entrty.ProductArticle;
import java.util.List;
import java.util.Map;

public interface ProductArticleMapper {
    int insert(ProductArticle record);

    int insertSelective(ProductArticle record);

    int updateByPrimaryKey(ProductArticle record);

    int updateByPrimaryKeySelective(ProductArticle record);

    int deleteByPrimaryKey(Integer id);

    ProductArticle selectByPrimaryKey(Integer id);

    List<ProductArticle> selectAll(Map<Object, Object> param);

    List<ProductArticle> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);

    ProductArticle selectByArticleId(Integer id);
}