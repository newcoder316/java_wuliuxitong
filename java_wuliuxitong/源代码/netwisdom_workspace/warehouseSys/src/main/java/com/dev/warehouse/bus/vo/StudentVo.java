package com.dev.warehouse.bus.vo;


import com.dev.warehouse.bus.entity.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class StudentVo extends Student {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2476981547978691730L;
	/**
     * 分页参数，当前是第一页，每页10条数据
     */
    private Integer page=1;
    private Integer limit=10;

    /**
     * 批量删除客户，存放客户ID的数组
     */
    private Integer[] ids;

}
