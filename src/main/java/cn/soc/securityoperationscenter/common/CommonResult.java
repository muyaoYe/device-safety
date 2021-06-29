package cn.soc.securityoperationscenter.common;

public class CommonResult {
    private String retCode;
    private String retMessage;
    private Object result;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
    public CommonResult(String retCode, String retMessage, Object result) {
        this.retCode = retCode;
        this.retMessage = retMessage;
        this.result = result;
    }

    public CommonResult() {
    }
}
