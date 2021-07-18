package com.birdy.kiwi;

import com.birdy.kiwi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KiwiController {
    @Autowired
    private KiwiService kiwiService;

    @GetMapping("/")
    private String helloworld(){
        return "My First Web App on Heroku";
    }

    @GetMapping("/users")
    private List<User> getUsers(){
        return kiwiService.getUsers();
    }

    @PostMapping("/add")
    private String add(@RequestBody User user){
        return kiwiService.addUser(user);
    }
    @PutMapping("/update")
    private String update(@RequestBody User user){
        return kiwiService.updateUser(user);
    }
    @DeleteMapping ("/delete")
    private String delete(@RequestBody String userName){
        return kiwiService.delete(userName);
    }
}
