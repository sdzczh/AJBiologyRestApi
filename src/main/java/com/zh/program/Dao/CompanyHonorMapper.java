package com.zh.program.Dao;

import com.zh.program.Entrty.CompanyHonor;
import java.util.List;
import java.util.Map;

public interface CompanyHonorMapper {
    int insert(CompanyHonor record);

    int insertSelective(CompanyHonor record);

    int updateByPrimaryKey(CompanyHonor record);

    int updateByPrimaryKeySelective(CompanyHonor record);

    int deleteByPrimaryKey(Integer id);

    CompanyHonor selectByPrimaryKey(Integer id);

    List<CompanyHonor> selectAll(Map<Object, Object> param);

    List<CompanyHonor> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}