package org.com.lab.error;

import org.example.javaframework.web.common.InterfaceErrorCode;
import org.springframework.http.HttpStatus;

public enum LabErrorCode implements InterfaceErrorCode {
    CHANNEL_NOT_FOUND(HttpStatus.NOT_FOUND),
    DOMAIN_ACCESS_DENIED(HttpStatus.FORBIDDEN);

    private final HttpStatus httpStatus;

    LabErrorCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String getCode() {
        return name();
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
