package com.mouse.site.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.mouse.site.pojo.Site;
import com.mouse.site.service.SiteService;
import com.mouse.site.util.JsonUtils;

@Controller
public class SiteController {
	
	@Resource
	private SiteService siteService;
	
	@ResponseBody
	@RequestMapping(value="/index.do")
	public String siteList(Integer page,Integer rows){
		Map hashMap = new HashMap<>();
		hashMap.put("page", page);
		hashMap.put("rows", 1);
		List<Site> siteList = siteService.siteList(hashMap);
		return JsonUtils.toJSONString(siteList);
	}
	
}
