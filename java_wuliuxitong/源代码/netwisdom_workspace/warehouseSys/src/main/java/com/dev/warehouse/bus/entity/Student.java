package com.dev.warehouse.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)//这个注解的意思？
@TableName("userinfo")
@ToString

public class Student implements Serializable {
	
 @TableId(value = "id", type = IdType.AUTO)

    private static final long serialVersionUID=1L;
 
    private Integer id;

    private String username;
    
    private String password;
    
    private String sex;
    
    private String major;
    
    private String intro;
    
    private Integer delflg;
}
