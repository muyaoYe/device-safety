package cn.soc.securityoperationscenter.entity;

import java.util.Date;

public class WarningLibraryShow {
    private Integer id;

    private String warningName;

    private String missionMainType;

    private String missionSubType;

    private String createPerson;

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
        this.warningName = warningName;
    }

    public String getMissionMainType() {
        return missionMainType;
    }

    public void setMissionMainType(String missionMainType) {
        this.missionMainType = missionMainType;
    }

    public String getMissionSubType() {
        return missionSubType;
    }

    public void setMissionSubType(String missionSubType) {
        this.missionSubType = missionSubType;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
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
        this.url = url;
    }
}
