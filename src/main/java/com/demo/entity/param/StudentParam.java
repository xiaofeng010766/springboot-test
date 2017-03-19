package com.demo.entity.param;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2017/3/19.
 */
public class StudentParam {
    @ApiModelProperty(value = "学生Id", required = true)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
