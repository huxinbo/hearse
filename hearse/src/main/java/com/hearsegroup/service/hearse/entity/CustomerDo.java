package com.hearsegroup.service.hearse.entity;

import lombok.Data;

import java.time.Instant;

@Data
public class CustomerDo {
    private Long id;
    private Integer version;
    private Instant createAt;
    private Instant updateAt;
    private String json;
    private String ref;
    private String tel;


}
