package com.gnlsystems.vcs.controllers;

//import com.gnlsystems.VCS.model.User;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/")
//public class  MainController {
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping("/users")
//    public List<User> getUsers() {
//        List<User> list = new ArrayList<>();
////        list.add(new User(546, "John"));
////        list.add(new User(894, "Mary"));
////        list.add(new User(326, "Jane"));
//        return list;
//    }
//
//
//
//}



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "home";
    }


}
