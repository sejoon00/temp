package com.post.blog.global.error.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends BusinessException{

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode);
    }
}
