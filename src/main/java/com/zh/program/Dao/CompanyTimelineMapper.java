package com.zh.program.Dao;

import com.zh.program.Entrty.CompanyTimeline;
import java.util.List;
import java.util.Map;

public interface CompanyTimelineMapper {
    int insert(CompanyTimeline record);

    int insertSelective(CompanyTimeline record);

    int updateByPrimaryKey(CompanyTimeline record);

    int updateByPrimaryKeySelective(CompanyTimeline record);

    int deleteByPrimaryKey(Integer id);

    CompanyTimeline selectByPrimaryKey(Integer id);

    List<CompanyTimeline> selectAll(Map<Object, Object> param);

    List<CompanyTimeline> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}