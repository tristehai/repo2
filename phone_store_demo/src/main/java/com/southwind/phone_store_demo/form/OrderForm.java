package com.southwind.phone_store_demo.form;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;

@Data
public class OrderForm {

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @NotEmpty(message = "电话不能为空")
    private String tel;
    @NotEmpty(message = "地址不能为空")
    private String address;
  @NotEmpty(message = "规格不能为空")
    public Integer specsId;
  @NotEmpty(message = "数量不能为空")
    private Integer quantity;
}
