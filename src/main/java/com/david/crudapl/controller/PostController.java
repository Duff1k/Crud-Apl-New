package com.david.crudapl.controller;

import com.david.crudapl.model.Post;
import com.david.crudapl.model.Region;
import com.david.crudapl.repository.PostRepository;
import com.david.crudapl.repository.RegionRepository;
import com.david.crudapl.repository.io.JavaIOPostRepositoryImpl;
import com.david.crudapl.repository.io.JavaIORegionRepositoryImpl;

import java.util.Date;
import java.util.List;

public class PostController {
    PostRepository pr = new JavaIOPostRepositoryImpl();

    public List<Post> getAll() {
        return pr.getAll();
    }

    public Post getById(String id) {
        return pr.getById(Long.parseLong(id));
    }

    public Post save(String id, String content, Date create, Date update) {
        return pr.save(new Post(Long.parseLong(id), content, create, update));
    }

    public Post update(String id, String content, Date create, Date update) {
        return pr.update(new Post(Long.parseLong(id), content,create,update));
    }

    public void deleteById(String id){
        pr.deleteById(Long.parseLong(id));
    }
}
