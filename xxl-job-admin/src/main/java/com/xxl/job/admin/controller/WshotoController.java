package com.xxl.job.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * index controller
 *
 * @author xuxueli 2015-12-19 16:13:16
 */
@Controller
@RequestMapping("/wscm")
public class WshotoController {

    @RequestMapping("/heart")
    @ResponseBody
    public String heart() {
        return "SUCCESS";
    }

}
