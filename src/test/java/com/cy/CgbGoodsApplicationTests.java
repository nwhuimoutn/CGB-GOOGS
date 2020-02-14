package com.cy;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CgbGoodsApplicationTests {
    @Autowired
    GoodsDao goodsDao;

    @Test
    void contextLoads() {
        List<Goods> goods = goodsDao.findGoods();
        for (Goods g:goods){
            System.out.println(g);
        }
    }

}
