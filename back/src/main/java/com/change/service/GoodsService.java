package com.change.service;

import com.change.pojo.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> queryAllGoods();

    public Goods queryGoods(String goodsId);

    public void reduceScore(String score);
}
