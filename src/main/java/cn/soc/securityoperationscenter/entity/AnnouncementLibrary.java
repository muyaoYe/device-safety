package cn.soc.securityoperationscenter.entity;

import java.util.Date;

public class AnnouncementLibrary {
    private Integer id;

    private String announcementName;

    private Integer createPerson;

    private Date createTime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnnouncementName() {
        return announcementName;
    }

    public void setAnnouncementName(String announcementName) {
        this.announcementName = announcementName == null ? null : announcementName.trim();
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