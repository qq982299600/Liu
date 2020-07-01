package com.controller.test;

import com.common.Result;
import com.common.em.ResultCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Redgi Liu
 * @date: 2020/7/1 17:05
 */

@RestController
@RequestMapping("/test_api")
public class TestController {


    @RequestMapping(value = "/v1/test", method = RequestMethod.POST)
    public Result test(@RequestBody String params,
                       HttpServletRequest request){


        return new Result(ResultCode.OK.getCode(), ResultCode.OK.getMessage(),"你贼jier帅");
    }

}
