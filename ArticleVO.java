package com.bees.workPortal.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by guihao on 2019-10-18 10:55
 * 工作通知和规范标准vo对象
 */
@Data
@ApiModel("工作通知/规范标准对象")
public class ArticleVO implements Serializable {
	@ApiModelProperty("主键")
	private Integer id;

	@NotBlank(message = "标题不能为空")
	@ApiModelProperty("标题")
	private String title;

	@ApiModelProperty("发布时间")
	private Date publishTime;

	@NotNull(message = "类型不能为空，类型 1:工作通知 2:标准规范 3:组织工作")
	@ApiModelProperty("类型 1:工作通知 2:标准规范 3:组织工作")
	private Byte ntype;

	@ApiModelProperty("组织机构类型 0:不区分，1：厅局，2：地市")
	private Byte deptType;
}
