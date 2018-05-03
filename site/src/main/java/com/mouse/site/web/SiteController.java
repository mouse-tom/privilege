package com.mouse.site.web;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	@RequestMapping(value="/listSite.html")
	public String siteList(Integer page,Integer rows,HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "*");  
		page = page==null?1:page;
		rows = rows==null?10:rows;
		Map hashMap = new HashMap<>();
		hashMap.put("page", page);
		hashMap.put("rows", rows);
		List<Site> siteList = siteService.siteList(hashMap);
		response.setContentType("application/json");
		return JsonUtils.toJSONString(siteList);
	}
	
	@ResponseBody
	@RequestMapping(value="/delSite.html")
	public String siteDel(String ids){
		Map hashMap = new HashMap<>();
		if(ids == null && "".equals(ids)){
			hashMap.put("msg", "请选中一条数据");
			hashMap.put("success","false");
		}else{
			String[] strArr = ids.split(",");
			for (int i = 0; i < strArr.length; i++) {
				siteService.delSite(strArr[i]);
			}
			hashMap.put("msg", "删除成功");
			hashMap.put("success",true);
		}
		return JsonUtils.toJSONString(hashMap);
	}
	
	@ResponseBody
	@RequestMapping(value="/addSite.html")
	public String siteAdd(Site site){
		Map hashMap = new HashMap<>();
		site.setCreatTime(new Date());
	
		Integer flag = siteService.addSite(site);
		if(flag == 1) hashMap.put("msg", "添加成功");
		else hashMap.put("msg", "添加失败");
		return JsonUtils.toJSONString(hashMap);
	}
	
}
