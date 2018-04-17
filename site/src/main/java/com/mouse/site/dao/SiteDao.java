package com.mouse.site.dao;

import java.util.List;
import java.util.Map;

import com.mouse.site.pojo.Site;

public interface SiteDao {
    int deleteByPrimaryKey(String id);

    int insert(Site record);

    int insertSelective(Site record);

    Site selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
    
    List<Site> siteList(Map hashMap);
    
    
}