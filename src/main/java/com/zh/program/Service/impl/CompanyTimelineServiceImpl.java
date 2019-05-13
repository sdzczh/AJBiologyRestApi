package com.zh.program.Service.impl;

import com.zh.program.Dao.CompanyTimelineMapper;
import com.zh.program.Entrty.CompanyTimeline;
import com.zh.program.Service.CompanyTimelineService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 16:09:03
 **/ 
@Service("companyTimelineService")
public class CompanyTimelineServiceImpl implements CompanyTimelineService {
    @Resource
    private CompanyTimelineMapper companyTimelineMapper;

    private static final Logger logger = LoggerFactory.getLogger(CompanyTimelineServiceImpl.class);

    @Override
    public int insert(CompanyTimeline record) {
        return this.companyTimelineMapper.insert(record);
    }

    @Override
    public int insertSelective(CompanyTimeline record) {
        return this.companyTimelineMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CompanyTimeline record) {
        return this.companyTimelineMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CompanyTimeline record) {
        return this.companyTimelineMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.companyTimelineMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CompanyTimeline selectByPrimaryKey(Integer id) {
        return this.companyTimelineMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CompanyTimeline> selectAll(Map<Object, Object> param) {
        return this.companyTimelineMapper.selectAll(param);
    }

    @Override
    public List<CompanyTimeline> selectPaging(Map<Object, Object> param) {
        return this.companyTimelineMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.companyTimelineMapper.selectCount(param);
    }
}