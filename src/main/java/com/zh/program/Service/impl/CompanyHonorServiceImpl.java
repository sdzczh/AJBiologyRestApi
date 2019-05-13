package com.zh.program.Service.impl;

import com.zh.program.Dao.CompanyHonorMapper;
import com.zh.program.Entrty.CompanyHonor;
import com.zh.program.Service.CompanyHonorService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 15:56:17
 **/ 
@Service("companyHonorService")
public class CompanyHonorServiceImpl implements CompanyHonorService {
    @Resource
    private CompanyHonorMapper companyHonorMapper;

    private static final Logger logger = LoggerFactory.getLogger(CompanyHonorServiceImpl.class);

    @Override
    public int insert(CompanyHonor record) {
        return this.companyHonorMapper.insert(record);
    }

    @Override
    public int insertSelective(CompanyHonor record) {
        return this.companyHonorMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CompanyHonor record) {
        return this.companyHonorMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CompanyHonor record) {
        return this.companyHonorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.companyHonorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CompanyHonor selectByPrimaryKey(Integer id) {
        return this.companyHonorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CompanyHonor> selectAll(Map<Object, Object> param) {
        return this.companyHonorMapper.selectAll(param);
    }

    @Override
    public List<CompanyHonor> selectPaging(Map<Object, Object> param) {
        return this.companyHonorMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.companyHonorMapper.selectCount(param);
    }
}