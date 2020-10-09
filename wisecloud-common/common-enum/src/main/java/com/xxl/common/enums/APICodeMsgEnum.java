package com.xxl.common.enums;

import lombok.Getter;

@Getter
public enum APICodeMsgEnum {

    /**
     * 公共网元状态码
     */
    PARAM_ERROR("1", "参数错误"),
    CONFIG_ERROR("2", "数据配置错误"),
    REQUEST_FAIL("3", "请求失败"),
    NO_CONDITION("4", "条件不满足"),
    NOT_FOUND("5", "数据不存在"),
    SYS_BUSY("6", "系统繁忙，请稍后再试"),
    NOT_IN_DATE_RANGE("7", "不在时间范围内"),
    DB_SOLR_REDIS_ERROR("8", "DB或Solr或Redis错误"),
    NO_BALANCE("9", "余额不足"),


    /**
     * HTTP通用状态码
     */
    SUCCESS("0", "请求成功"),
    SYSTEM_ERROR("500", "系统内部错误");

    private String code;
    private String msg;

    APICodeMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
