package com.zh.program.Service;

import com.zh.program.Entrty.CompanyHonor;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-13 15:56:17
 **/ 
public interface CompanyHonorService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int insert(CompanyHonor record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int insertSelective(CompanyHonor record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int updateByPrimaryKey(CompanyHonor record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int updateByPrimaryKeySelective(CompanyHonor record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    CompanyHonor selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    List<CompanyHonor> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    List<CompanyHonor> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-13 15:56:17
     **/ 
    int selectCount(Map<Object, Object> param);
}