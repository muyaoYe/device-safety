package cn.soc.securityoperationscenter.enums;

public enum CodeEnum {
    SUCCESS("200", "success"),

    ERROR("100", "error");


    private final String value;
    private final String text;

    CodeEnum(String  value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Gets by value.
     *
     * @param value the value
     * @return the by value
     */
    public static CodeEnum getByValue(String  value) {
        for (CodeEnum temp : CodeEnum.values()) {
            if (temp.getValue().equals(value) ) {
                return temp;
            }
        }
        return null;
    }
}
