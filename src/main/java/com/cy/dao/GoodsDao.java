package com.cy.dao;

import com.cy.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDao {
    @Select("select * from tb_goods")
    List<Goods> findGoods();
    @Delete("delete from tb_goods where id=#{id}")
    int deleteById(Long id);
}
