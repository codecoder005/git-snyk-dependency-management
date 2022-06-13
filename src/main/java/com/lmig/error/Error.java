package com.lmig.error;

import lombok.Data;

import java.sql.Timestamp;

@Data
public
class Error {
    private final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private Object data;
}
