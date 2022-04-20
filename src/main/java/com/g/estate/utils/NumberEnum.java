package com.g.estate.utils;

public enum NumberEnum {

    T_BOOKMARK("t_bookmark"),
    T_BLOG("t_blog"),
    T_BLOG_TYPE("t_blog_type"),
    ;

    private String tableName;

    NumberEnum(String tableName) {
        this.tableName = tableName;
    }

    public String value() {
        return tableName;
    }
}
