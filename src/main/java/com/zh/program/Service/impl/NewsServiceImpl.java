package com.zh.program.Service.impl;

import com.zh.program.Dao.NewsMapper;
import com.zh.program.Entrty.News;
import com.zh.program.Service.NewsService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-15 16:28:09
 **/ 
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;

    private static final Logger logger = LoggerFactory.getLogger(NewsServiceImpl.class);

    @Override
    public int insert(News record) {
        return this.newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record) {
        return this.newsMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return this.newsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return this.newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public News selectByPrimaryKey(Integer id) {
        return this.newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<News> selectAll(Map<Object, Object> param) {
        return this.newsMapper.selectAll(param);
    }

    @Override
    public List<News> selectPaging(Map<Object, Object> param) {
        return this.newsMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.newsMapper.selectCount(param);
    }

    @Override
    public List<News> getIndxList() {
        Map<Object, Object> map = new HashMap<>();
        map.put("firstResult", 0);
        map.put("maxResult", 4);
        List<News> news = this.newsMapper.selectPaging(map);
        News newss = new News();
        List<News> newsList = new LinkedList<>();
        for (News news1 : news){
            newss.setImgUrl(news1.getImgUrl());
            newss.setCreateTime(news1.getCreateTime());
            newss.setDescribe(news1.getDescribe());
            newss.setTitle(news1.getTitle());
            newss.setId(news1.getId());
            newsList.add(newss);
        }
        return newsList;
    }
}