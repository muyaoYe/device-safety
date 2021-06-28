package cn.soc.securityoperationscenter.server.pojo.library;

import java.util.Date;

public class WarningLibrary {
    private Integer id;

    private String warningName;

    private String missionMainType;

    private String missionSubType;

    private Integer createPerson;

    private Date createTime;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarningName() {
        return warningName;
    }

    public void setWarningName(String warningName) {
        this.warningName = warningName == null ? null : warningName.trim();
    }

    public String getMissionMainType() {
        return missionMainType;
    }

    public void setMissionMainType(String missionMainType) {
        this.missionMainType = missionMainType == null ? null : missionMainType.trim();
    }

    public String getMissionSubType() {
        return missionSubType;
    }

    public void setMissionSubType(String missionSubType) {
        this.missionSubType = missionSubType == null ? null : missionSubType.trim();
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