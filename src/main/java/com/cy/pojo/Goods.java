package com.cy.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class Goods {
    private Long id;
    private String name;
    private String remark;
    private Date createdTime;
}
