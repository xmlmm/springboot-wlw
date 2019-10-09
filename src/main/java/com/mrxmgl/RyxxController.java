package com.mrxmgl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2019/7/11 0011 19:49
 */
@RestController
@RequestMapping(value = "/wlw/ryxx")
public class RyxxController {

    @RequestMapping(value = "/browse")
    public String browse(String name){
        System.out.print(name+"wlw---------Hello World");
        return name+"wlw---------Hello World";
    }
}