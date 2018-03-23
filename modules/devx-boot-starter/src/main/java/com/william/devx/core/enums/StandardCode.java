package com.william.devx.core.enums;

/**
 * Created by sungang on 2017/11/3.
 */
public enum StandardCode {

    SUCCESS("200"),
    BAD_REQUEST("400"),
    UNAUTHORIZED("401"),
    FORBIDDEN("403"),
    NOT_FOUND("404"),
    CONFLICT("409"),
    LOCKED("423"),
    UNSUPPORTED_MEDIA_TYPE("415"),
    INTERNAL_SERVER_ERROR("500"),
    NOT_IMPLEMENTED("501"),
    SERVICE_UNAVAILABLE("503"),
    UNKNOWN("-1");

    private String code;

    private StandardCode(String code) {
        this.code = code;
    }

    public String toString() {
        return this.code;
    }
}
