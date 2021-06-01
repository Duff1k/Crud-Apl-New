package com.david.crudapl.repository.io;

import com.david.crudapl.model.Post;
import com.david.crudapl.repository.PostRepository;
import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaIOPostRepositoryImpl implements PostRepository {

    private String POST_FILE_PATH = "src//main//resources//files//posts.json";

    @Override
    public List<Post> getAll() {
        try {
            Files.lines(Paths.get(POST_FILE_PATH), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Post getById(Long aLong) {
        return null;
    }

    @Override
    public Post save(Post post) {
        File file = new File(POST_FILE_PATH);
        FileWriter fr = null;
        Gson gson = new Gson();
        String JSON = gson.toJson(post.toString());
        try {
            fr = new FileWriter(file, true);
            fr.write(JSON);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return post;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
