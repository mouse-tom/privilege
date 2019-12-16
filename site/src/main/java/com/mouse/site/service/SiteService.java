package com.mouse.site.service;

import java.util.List;
import java.util.Map;

import com.mouse.site.pojo.Site;

public interface SiteService {
	
	public List<Site> siteList(Map hashMap);
	
	public Integer delSite(String id);
	
	public Integer addSite(Site site);
	
	public Integer updateEnableSite(String id,String enable);
	
	public List<Site> reviewSiteList();
	
}
