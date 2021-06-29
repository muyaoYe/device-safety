package cn.soc.securityoperationscenter.entity;

import java.util.Date;

public class ResponseLibrary {
    private Integer id;

    private String responseName;

    private String responseType;

    private Integer createPerson;

    private Date createTime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName == null ? null : responseName.trim();
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType == null ? null : responseType.trim();
    }

    public Integer getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}