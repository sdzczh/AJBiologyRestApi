package com.zh.program.Dao;

import com.zh.program.Entrty.Quality;
import java.util.List;
import java.util.Map;

public interface QualityMapper {
    int insert(Quality record);

    int insertSelective(Quality record);

    int updateByPrimaryKey(Quality record);

    int updateByPrimaryKeySelective(Quality record);

    int deleteByPrimaryKey(Integer id);

    Quality selectByPrimaryKey(Integer id);

    List<Quality> selectAll(Map<Object, Object> param);

    List<Quality> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}