package com.example.demo;

import com.example.demo.domain.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class UserController {
    //@RequestMapping(value = "/users",method = RequestMethod.GET)
    @GetMapping(value = "/users")
    @ApiOperation(value = "查询用户列表",notes = "查询所有用户，返回用户信息")
    public List<User> findAllUsers(){
        return null;
    }

}
