package com.mouse.site.service.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mouse.site.dao.SiteDao;
import com.mouse.site.pojo.Site;
import com.mouse.site.service.SiteService;
import com.mouse.site.util.IDUtil;

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
		return siteDao.siteDel(id);
	}

	@Override
	public Integer addSite(Site site) {
		site.setId(IDUtil.getID());
		site.setSiteStatus(1);
		site.setEnableStatus(1);
		return siteDao.insertSelective(site);
	}

	@Override
	public Integer updateEnableSite(String id, String enable) {
		return siteDao.updateEnableSite(id, enable);
	}

	@Override
	public List<Site> reviewSiteList() {
		return siteDao.reviewSiteList();
	}
	
	
}
