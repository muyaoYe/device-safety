package cn.soc.securityoperationscenter.entity;

public class Assets {
    private Integer id;

    private String intranetIp;

    private String intranetPort;

    private String portService;

    private String extranetIp;

    private String extranetPort;

    private String domainName;

    private String assetLocation;

    private String businessType;

    private String serverType;

    private String osType;

    private String appType;

    private String version;

    private String parentProject;

    private String chargePerson;

    private String chargeDepartment;

    private String email;

    private String telphone;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntranetIp() {
        return intranetIp;
    }

    public void setIntranetIp(String intranetIp) {
        this.intranetIp = intranetIp == null ? null : intranetIp.trim();
    }

    public String getIntranetPort() {
        return intranetPort;
    }

    public void setIntranetPort(String intranetPort) {
        this.intranetPort = intranetPort == null ? null : intranetPort.trim();
    }

    public String getPortService() {
        return portService;
    }

    public void setPortService(String portService) {
        this.portService = portService == null ? null : portService.trim();
    }

    public String getExtranetIp() {
        return extranetIp;
    }

    public void setExtranetIp(String extranetIp) {
        this.extranetIp = extranetIp == null ? null : extranetIp.trim();
    }

    public String getExtranetPort() {
        return extranetPort;
    }

    public void setExtranetPort(String extranetPort) {
        this.extranetPort = extranetPort == null ? null : extranetPort.trim();
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getAssetLocation() {
        return assetLocation;
    }

    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation == null ? null : assetLocation.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType == null ? null : serverType.trim();
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType == null ? null : osType.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getParentProject() {
        return parentProject;
    }

    public void setParentProject(String parentProject) {
        this.parentProject = parentProject == null ? null : parentProject.trim();
    }

    public String getChargePerson() {
        return chargePerson;
    }

    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson == null ? null : chargePerson.trim();
    }

    public String getChargeDepartment() {
        return chargeDepartment;
    }

    public void setChargeDepartment(String chargeDepartment) {
        this.chargeDepartment = chargeDepartment == null ? null : chargeDepartment.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}