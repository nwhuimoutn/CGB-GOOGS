package com.cy.service;


import com.cy.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findGoods();
    int deleteById(Long id);
}
