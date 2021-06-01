package com.david.crudapl.view;

import Console.ConsoleInput;
import com.david.crudapl.controller.PostController;
import com.david.crudapl.controller.RegionController;
import com.david.crudapl.model.Post;
import com.david.crudapl.model.Region;

import java.util.List;
import java.util.Scanner;

public class PostView {
    public PostController pc = new PostController();

    public void getAll(){
        List<Post> posts = pc.getAll();
        posts.forEach(r -> {
            System.out.println(r);
        });
    }

    public void getById(){
        Post post = pc.getById(ConsoleInput.idPost);
        System.out.println(post);
    }

    public void save(){
        pc.save(ConsoleInput.savingIdPost, ConsoleInput.savingContentPost, ConsoleInput.savingCreatePost, ConsoleInput.savingUpdatePost);
        //getAll();
    }

    public void update(){
        pc.update(ConsoleInput.updateIdPost, ConsoleInput.updateContentPost, ConsoleInput.updateCreatePost,ConsoleInput.updateUpdatePost);
        //getAll();

    }

    public void deleteById(){
        pc.deleteById(ConsoleInput.deleteIdPost);
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
