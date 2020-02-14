package com.cy.serviceImpl;

import com.cy.dao.GoodsDao;
import com.cy.pojo.Goods;
import com.cy.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;

    @Override
    public List<Goods> findGoods() {
        List<Goods> goods = goodsDao.findGoods();
        return goods;
    }

    @Override
    public int deleteById(Long id) {
        int row = goodsDao.deleteById(id);
        log.info("{} 删除成功",id);
        return row;
    }


}
