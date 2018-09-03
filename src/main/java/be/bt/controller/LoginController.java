package be.bt.controller;

import be.bt.domain.LoginInfo;
import be.bt.domain.User;
import be.bt.repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/login")
@CrossOrigin(origins="*")
public class LoginController  {

    @Autowired
    ILoginRepository repo;

    @PostMapping
    public User login(@RequestBody LoginInfo info) {

        List<User> users = repo.findAll();
        User user = null;

        for(User u : users){
            if(u.getLogin().equals(info.getLogin())){
               user = u;
            }
        }
        return user;
    }

}
