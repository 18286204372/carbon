package com.change.mapper;

import com.change.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    public List<Goods> queryAllGoods();

    public Goods queryGoodsById(String goodsId);

}
