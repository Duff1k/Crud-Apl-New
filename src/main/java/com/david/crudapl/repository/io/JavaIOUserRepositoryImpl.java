package com.david.crudapl.repository.io;

import com.david.crudapl.model.User;
import com.david.crudapl.repository.GenericRepository;
import com.david.crudapl.repository.UserRepository;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JavaIOUserRepositoryImpl implements UserRepository {

    private String USER_FILE_PATH = "src//main//resources//files//posts.json";

    @Override
    public List<User> getAll() {
        try {
            Files.lines(Paths.get(USER_FILE_PATH), StandardCharsets.UTF_8).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getById(Long aLong) {
        return null;
    }

    @Override
    public User save(User user) {
        File file = new File(USER_FILE_PATH);
        FileWriter fr = null;
        Gson gson = new Gson();
        String JSON = gson.toJson(user.toString());
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
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
