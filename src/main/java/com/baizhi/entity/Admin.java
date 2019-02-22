package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private Integer sex;

    private static final long serialVersionUID = 1L;


}