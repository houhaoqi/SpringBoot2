package com.haoqi.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/2/28 - 20:58
 */

@RestController
@RequestMapping("/test2")
public class testController {

    @GetMapping
    public String getById(){
        String text = "The second springBoot Application running....";
        System.out.println(text);
        return text;
    }

}
