package com.xxl.job.admin.controller;

import com.xxl.job.admin.controller.annotation.PermissionLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * index controller
 *
 * @author xuxueli 2015-12-19 16:13:16
 */
@Controller
@RequestMapping("/wscrm")
public class WshotoController {

    @RequestMapping("/heart")
    @PermissionLimit(limit=false)
    @ResponseBody
    public String heart() {
        return "SUCCESS";
    }

}
