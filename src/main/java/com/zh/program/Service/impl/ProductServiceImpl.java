package com.zh.program.Service.impl;

import com.zh.program.Dao.ProductMapper;
import com.zh.program.Entrty.Product;
import com.zh.program.Service.ProductService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:18:57
 **/ 
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public int insert(Product record) {
        return this.productMapper.insert(record);
    }

    @Override
    public int insertSelective(Product record) {
        return this.productMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return this.productMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return this.productMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Product selectByPrimaryKey(Integer id) {
        return this.productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> selectAll(Map<Object, Object> param) {
        return this.productMapper.selectAll(param);
    }

    @Override
    public List<Product> selectPaging(Map<Object, Object> param) {
        return this.productMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.productMapper.selectCount(param);
    }
}