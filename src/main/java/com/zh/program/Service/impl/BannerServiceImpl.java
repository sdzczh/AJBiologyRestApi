package com.zh.program.Service.impl;

import com.zh.program.Dao.BannerDao;
import com.zh.program.Dao.UserDao;
import com.zh.program.Dao.UserMapper;
import com.zh.program.Entrty.Banner;
import com.zh.program.Entrty.User;
import com.zh.program.Service.BannerService;
import com.zh.program.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-01 14:20:13
 **/ 
@Service("bannerService")
public class BannerServiceImpl implements BannerService {

    @Resource
    private BannerDao bannerDao;

    @Override
    public List<Banner> findAll() {
        return this.bannerDao.findAll();
    }
}