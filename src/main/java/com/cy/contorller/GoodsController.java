package com.cy.contorller;

import com.cy.pojo.Goods;
import com.cy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods/")
public class GoodsController {
    @Autowired
    GoodsService goodsService;


    //springMVC默认用jacksonAPI将对象转化为json
    @ResponseBody
    @RequestMapping("doGoodsObject")
    public List<Goods> doGoodsObject(Integer page){
        System.out.println("page="+page); //page 用于传数据第几页
        return goodsService.findGoods();
    }

    @RequestMapping("doGoodsUI")
    public String doDoodsUI(){

        return "index-ajax";
    }
    @RequestMapping("findGoods")
    public String findGoods(Model model){
//        List<Goods> goods = goodsService.findGoods();
        model.addAttribute("list",goodsService.findGoods());
        return "index";
    }
    @RequestMapping("deleteById")
//    @ResponseBody
    public  String deleteById(Long id){
        goodsService.deleteById(id);
        return "redirect:findGoods";
    }
}
