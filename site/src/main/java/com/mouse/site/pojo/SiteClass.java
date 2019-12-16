package com.mouse.site.pojo;

import java.util.Date;

public class SiteClass {
    private String id;

    private String siteClassCode;

    private String siteClassName;

    private String pid;

    private String creator;

    private Date creatTime;

    private String modifier;

    private Date modifyTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSiteClassCode() {
        return siteClassCode;
    }

    public void setSiteClassCode(String siteClassCode) {
        this.siteClassCode = siteClassCode == null ? null : siteClassCode.trim();
    }

    public String getSiteClassName() {
        return siteClassName;
    }

    public void setSiteClassName(String siteClassName) {
        this.siteClassName = siteClassName == null ? null : siteClassName.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}