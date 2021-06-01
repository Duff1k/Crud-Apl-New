package com.david.crudapl.repository.io;

import com.david.crudapl.model.Post;
import com.david.crudapl.repository.PostRepository;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JavaIOPostRepositoryImpl implements PostRepository {

    private String POST_FILE_PATH = "src//main//resources//files//posts.json";

    @Override
    public List<Post> getAll() {
        List<Post> list = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(POST_FILE_PATH);
            Gson gson = new Gson();
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                strings.add(line);
                //System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < strings.size(); i++) {
            //list.add(new Post(strings.get(i).split()))
        }

        //System.out.println(strings);

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
