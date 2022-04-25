package com.change.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private String goodsId;
    private String goodsName;
    private double goodsScore;
    private String goodsPic;
}
