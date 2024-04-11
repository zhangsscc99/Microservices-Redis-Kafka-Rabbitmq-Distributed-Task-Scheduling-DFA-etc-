package com.heima.model.user.dtos;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginDto {

    /**
     * 手机号
     */

    //http://localhost:51801/swagger-ui.html  直接让人看
    @ApiModelProperty(value = "手机号",required = true)
    private String phone;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
