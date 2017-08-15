package com.malotor.taskmanager.Infrastructure.Presentation;

import com.malotor.taskmanager.Domain.User;
import com.malotor.taskmanager.Domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    User get(@PathVariable String username)
    {
        return userRepository.findByUsername(username);
    }

    @RequestMapping(method = RequestMethod.GET )
    Iterable<User> getAll()
    {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST )
    User create(@RequestParam String username, @RequestParam String name, @RequestParam String surname, @RequestParam String email)
    {

        User user = new User(username, name, surname, email);
        //User user = new User("malotor", "manrl", "test", "malotor@gmail.com");
        userRepository.save(user);

        return user;
    }
}
