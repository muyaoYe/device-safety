package cn.soc.securityoperationscenter.entity;

public class DataDictionary {
    private Integer id;

    private String dictionaryName;

    private String dictionaryCore;

    private String dictionaryValue;

    private String dataType;

    private String dictionaryType;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    public String getDictionaryCore() {
        return dictionaryCore;
    }

    public void setDictionaryCore(String dictionaryCore) {
        this.dictionaryCore = dictionaryCore == null ? null : dictionaryCore.trim();
    }

    public String getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(String dictionaryValue) {
        this.dictionaryValue = dictionaryValue == null ? null : dictionaryValue.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public String getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType == null ? null : dictionaryType.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}