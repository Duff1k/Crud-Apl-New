package com.david.crudapl.view;

import Console.ConsoleInput;
import com.david.crudapl.controller.PostController;
import com.david.crudapl.controller.UserController;
import com.david.crudapl.model.Post;
import com.david.crudapl.model.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
    public UserController us = new UserController();

    public void getAll(){
        List<User> users = us.getAll();
        users.forEach(r -> {
            System.out.println(r);
        });
    }

    public void getById(){
        User user = us.getById(ConsoleInput.idUser);
        System.out.println(user);
    }

    public void save(){
        us.save(ConsoleInput.savingIdUser, ConsoleInput.savingFirstNameUser, ConsoleInput.savingLastNameUser, ConsoleInput.savingListUser, ConsoleInput.savingRegionUser);
        getAll();
    }

    public void update(){
        us.update(ConsoleInput.updateIdUser, ConsoleInput.updateFirstNameUser, ConsoleInput.updateLastNameUser,ConsoleInput.updateListUser, ConsoleInput.updateRegionUser);
        getAll();

    }

    public void deleteById(){
        us.deleteById(ConsoleInput.deleteIdPost);
        getAll();

    }

    public static Long inputId(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    public static String inputContant(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static String inputCreate(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static String inputUpdate(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
