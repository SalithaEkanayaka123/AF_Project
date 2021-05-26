package com.testing.demo.Service;

import com.testing.demo.Model.Request.Users;
import com.testing.demo.Repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    Userrepository userrepository;
    UserService userService;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Users createUser(Users user) {
        //CREATE USER
        Users newUser = new Users();
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setUserName(user.getUserName());
        newUser.setPassword(user.getPassword());
        newUser.setType(user.getType());
        mongoTemplate.insert(newUser);
        //mongoTemplate
        return newUser;
    }

    @Override
    public List<Users> getAllUsers() {
        return mongoTemplate.findAll(Users.class);
    }

    @Override
    public Users getUserById(String id) {
        return null;
    }

    @Override
    public String generateToken(Users user) {
        return null;
    }

    @Override
    public String validateUser(Users user) {
        return null;
    }

    //IMPLEMENT CRUD METHODS HERE.


}
