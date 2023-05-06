package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author YiZhou
 * @date 2023/5/6
 * @Description
 */
@Data
@ToString
public class PageParams {

    @ApiModelProperty("页码")
    private Long pageNo = 1L;

    @ApiModelProperty("每页记录数")
    private Long pageSize = 10L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
