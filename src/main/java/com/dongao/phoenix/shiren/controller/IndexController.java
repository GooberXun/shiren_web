package com.dongao.phoenix.shiren.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xunxiaobo
 * @date 2022-03-28 16:09
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/test/index", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> index() {
        Map<String,Object> result = new HashMap<>();
        result.put("age", 18);
        result.put("sex", "男");
        result.put("name", "小明");
        return result;
    }

    @RequestMapping(value = "/test/home", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> home() {
        Map<String,Object> result = new HashMap<>();
        result.put("age", 18);
        result.put("sex", "男");
        result.put("name", "小明");
        result.put("class","三班");
        return result;
    }

    @RequestMapping(value = "/test/third", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> third() {
        Map<String,Object> result = new HashMap<>();
        result.put("age", 18);
        result.put("sex", "男");
        result.put("name", "小明");
        return result;
    }

    @RequestMapping(value = "/test/fouth", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> fouth() {
        Map<String,Object> result = new HashMap<>();
        result.put("age", 18);
        result.put("sex", "男");
        result.put("name", "小明");
        return result;
    }

    @RequestMapping(value = "/test/fifth", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> fifth() {
        Map<String,Object> result = new HashMap<>();
        result.put("age", 18);
        result.put("sex", "男");
        result.put("name", "小明");
        return result;
    }
}
