package com.gold.auth.gold_auth.global.error;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    USER_NOT_FOUND(HttpStatus.BAD_REQUEST, "사용자를 찾을 수 없습니다."),
    DATE_FORMAT_ERROR(HttpStatus.BAD_REQUEST, "날짜 형식이 맞지 않습니다."),
    USER_ALREADY_EXIST(HttpStatus.BAD_REQUEST, "이미 존재하는 사용자 입니다"),
    REDIS_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Redis 서버에서 오류가 발생했습니다."),
    REFRESH_TOKEN_NOT_FOUND(HttpStatus.NOT_FOUND,"토큰 정보가 존재하지 않습니다, 다시 로그인 해주세요.");

    private final HttpStatus httpStatus;
    private final String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
