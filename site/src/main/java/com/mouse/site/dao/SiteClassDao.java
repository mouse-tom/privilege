package com.mouse.site.dao;

import com.mouse.site.pojo.SiteClass;

public interface SiteClassDao {
    int deleteByPrimaryKey(String id);

    int insert(SiteClass record);

    int insertSelective(SiteClass record);

    SiteClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SiteClass record);

    int updateByPrimaryKey(SiteClass record);
}