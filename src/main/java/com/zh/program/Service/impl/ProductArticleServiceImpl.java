package com.zh.program.Service.impl;

import com.zh.program.Dao.ProductArticleMapper;
import com.zh.program.Entrty.ProductArticle;
import com.zh.program.Service.ProductArticleService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:20:05
 **/ 
@Service("productArticleService")
public class ProductArticleServiceImpl implements ProductArticleService {
    @Resource
    private ProductArticleMapper productArticleMapper;

    private static final Logger logger = LoggerFactory.getLogger(ProductArticleServiceImpl.class);

    @Override
    public int insert(ProductArticle record) {
        return this.productArticleMapper.insert(record);
    }

    @Override
    public int insertSelective(ProductArticle record) {
        return this.productArticleMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProductArticle record) {
        return this.productArticleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ProductArticle record) {
        return this.productArticleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.productArticleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ProductArticle selectByPrimaryKey(Integer id) {
        return this.productArticleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProductArticle> selectAll(Map<Object, Object> param) {
        return this.productArticleMapper.selectAll(param);
    }

    @Override
    public List<ProductArticle> selectPaging(Map<Object, Object> param) {
        return this.productArticleMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.productArticleMapper.selectCount(param);
    }

    @Override
    public ProductArticle selectByArticleId(Integer id) {
        return this.productArticleMapper.selectByArticleId(id);
    }
}