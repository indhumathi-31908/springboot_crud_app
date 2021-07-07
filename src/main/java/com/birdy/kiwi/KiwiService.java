package com.birdy.kiwi;

import com.birdy.kiwi.bean.User;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KiwiService {

    public List<User> getUsers(){
            User user1 = new User();
            user1.setId("123");
            user1.setName("Indhu");
            user1.setGender("F");
            List<User> users = new ArrayList<>();
            users.add(user1);
            return users;
    }
    public String addUser(User user){
        System.out.println("Inside add User");
        return "User" + user.getName()+ "addition completed successfully";
    }
    public String updateUser(User user){
        System.out.println("Inside update User");
        return "User" + user.getName()+ "update completed successfully";

    }
   public String delete(String userName){
        return "User" + userName + "Deletion Successful";
   }
}
