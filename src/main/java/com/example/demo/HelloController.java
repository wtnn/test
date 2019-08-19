package com.example.demo;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("exe")
@ApiIgnore
public class HelloController {
    @RequestMapping(value="hello/{name}",method= RequestMethod.GET)
    public String  hello(
            @PathVariable String name,
            @RequestParam String hey
    ){
        return "hello word!\n"+name+" "+hey;
    }
    @RequestMapping(value="/test",method = RequestMethod.POST)
    public User  user(@RequestBody User user){
        return user;
    }



}
