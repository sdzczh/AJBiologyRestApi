package com.zh.program.Service.impl;

import com.zh.program.Dao.QualityMapper;
import com.zh.program.Entrty.Quality;
import com.zh.program.Service.QualityService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:41:58
 **/ 
@Service("qualityService")
public class QualityServiceImpl implements QualityService {
    @Resource
    private QualityMapper qualityMapper;

    private static final Logger logger = LoggerFactory.getLogger(QualityServiceImpl.class);

    @Override
    public int insert(Quality record) {
        return this.qualityMapper.insert(record);
    }

    @Override
    public int insertSelective(Quality record) {
        return this.qualityMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Quality record) {
        return this.qualityMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Quality record) {
        return this.qualityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.qualityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Quality selectByPrimaryKey(Integer id) {
        return this.qualityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Quality> selectAll(Map<Object, Object> param) {
        return this.qualityMapper.selectAll(param);
    }

    @Override
    public List<Quality> selectPaging(Map<Object, Object> param) {
        return this.qualityMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.qualityMapper.selectCount(param);
    }
}