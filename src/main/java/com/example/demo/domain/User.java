package com.example.demo.domain;

import io.swagger.annotations.ApiModelProperty;

public class User {
    @ApiModelProperty(value = "中文姓名",example = "吴小婷")
    private String name;
    @ApiModelProperty(value = "年龄",example = "18")
    private String age;
    private String t;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
