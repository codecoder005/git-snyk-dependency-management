package com.lmig.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserDto {
    private Long uid;
    private String email;
    private String name;
    private Date dob;
    private String gender;
}
