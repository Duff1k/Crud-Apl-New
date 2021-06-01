package com.david.crudapl.controller;

import com.david.crudapl.model.Post;
import com.david.crudapl.model.Region;
import com.david.crudapl.model.User;
import com.david.crudapl.repository.UserRepository;
import com.david.crudapl.repository.io.JavaIOUserRepositoryImpl;

import java.util.Date;
import java.util.List;

public class UserController {
    UserRepository up = new JavaIOUserRepositoryImpl();

    public List<User> getAll(){
        return up.getAll();
    }

    public User getById(String id) {
        return up.getById(Long.parseLong(id));
    }

    public User save(String id, String firstname, String lastname, List<Post> posts, Region region) {
        return up.save(new User(Long.parseLong(id), firstname, lastname, posts, region));
    }

    public User update(String id, String firstname, String lastname, List<Post> posts, Region region) {
        return up.update(new User(Long.parseLong(id), firstname, lastname, posts, region));
    }

    public void deleteById(String id){
        up.deleteById(Long.parseLong(id));
    }
}
