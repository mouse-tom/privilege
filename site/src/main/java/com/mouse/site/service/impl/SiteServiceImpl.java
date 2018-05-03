package com.mouse.site.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mouse.site.dao.SiteDao;
import com.mouse.site.pojo.Site;
import com.mouse.site.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService{
	
	@Resource
	private SiteDao siteDao;

	@Override
	public List<Site> siteList(Map hashMap) {
		PageHelper.startPage((int)hashMap.get("page"),(int) hashMap.get("rows"));
		List<Site> siteList = siteDao.siteList(hashMap);
		PageInfo<Site> pageInfo = new PageInfo<>(siteList);
		return siteList;
	}

	@Override
	public Integer delSite(String id) {
		return siteDao.deleteByPrimaryKey(id);
	}

	@Override
	public Integer addSite(Site site) {
		return siteDao.insertSelective(site);
	}
	
}
