package Console;

import com.david.crudapl.model.Post;
import com.david.crudapl.model.Region;
import com.david.crudapl.model.User;
import com.david.crudapl.repository.io.JavaIOPostRepositoryImpl;
import com.david.crudapl.repository.io.JavaIOUserRepositoryImpl;
import com.david.crudapl.view.PostView;
import com.david.crudapl.view.RegionView;
import com.david.crudapl.view.UserView;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput {

    public static String idRegion;
    public static String savingIdRegion;
    public static  String savingReg;
    public static String updateIdRegion;
    public static  String updateReg;
    public static String deleteIdRegion;

    public static String idPost;
    public static String savingIdPost;
    public static  String savingContentPost;
    public static Date savingCreatePost;
    public static Date savingUpdatePost;
    public static String updateIdPost;
    public static  String updateContentPost;
    public static Date updateCreatePost;
    public static  Date updateUpdatePost;
    public static String deleteIdPost;


    public static String savingIdUser;
    public static String savingFirstNameUser;
    public static String savingLastNameUser;
    public static List<Post> savingListUser;
    public static Region savingRegionUser;
    public static String updateIdUser;
    public static String updateFirstNameUser;
    public static String updateLastNameUser;
    public static List<Post> updateListUser;
    public static Region updateRegionUser;
    public static String idUser;
    public static String deleteUser;


    public static void main(String[] args) {
        System.out.println("Введите Region, если хотите работать с файлом regions.txt");
        System.out.println("Введите Post, если хотите работать с файлом posts.json");
        System.out.println("Введите User, если хотите работать с файлом users.json");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.next();
        if(task.equals("Region")) {
            RegionView regionView = new RegionView();
            System.out.println("Какую задачу выполнить ? (Вывести, ВывестиId, Сохранить, Изменить, Удалить");
            String subproblem = scanner.next();
            if(subproblem.equals("Вывести")) {
                regionView.getAll();
            } else if(subproblem.equals("ВывестиId")) {
                ConsoleInput.idRegion = scanner.next();
                regionView.getById();
            } else if(subproblem.equals("Сохранить")) {
                ConsoleInput.savingIdRegion = scanner.next();
                ConsoleInput.savingReg = scanner.next();
                regionView.save();
            } else if(subproblem.equals("Удалить")) {
                ConsoleInput.deleteIdRegion = scanner.next();
                regionView.deleteById();
            } else if(subproblem.equals("Изменить")) {
                ConsoleInput.updateIdRegion = scanner.next();
                ConsoleInput.updateReg = scanner.next();
                regionView.update();
            }
        } else if(task.equals("Post")) {
            PostView postView= new PostView();
            System.out.println("Какую задачу выполнить ? (Вывести, ВывестиId, Сохранить, Изменить, Удалить");
            String subproblem = scanner.next();
            if(subproblem.equals("Вывести")) {
                postView.getAll();
            } else if(subproblem.equals("ВывестиId")) {
                ConsoleInput.idPost = scanner.next();
                postView.getById();
            } else if(subproblem.equals("Сохранить")) {
                ConsoleInput.savingIdPost = scanner.next();
                ConsoleInput.savingContentPost = scanner.next();
                ConsoleInput.savingCreatePost = new Date();
                ConsoleInput.savingUpdatePost = new Date();
                postView.save();
            } else if(subproblem.equals("Удалить")) {
                ConsoleInput.deleteIdPost = scanner.next();
                postView.deleteById();
            } else if(subproblem.equals("Изменить")) {
                ConsoleInput.updateIdPost = scanner.next();
                ConsoleInput.updateContentPost = scanner.next();
                postView.update();
            }
        } else if(task.equals("User")) {
            UserView userView = new UserView();
            System.out.println("Какую задачу выполнить ? Вывести, ВывестиId, Сохранить, Изменить, Удалить");
            String subproblem = scanner.next();
            if(subproblem.equals("Вывести")) {
                userView.getAll();
            } else if(subproblem.equals("ВывестиId")) {
                ConsoleInput.idUser = scanner.next();
                userView.getById();
            } else if(subproblem.equals("Сохранить")) {
                ConsoleInput.savingIdUser = scanner.next();
                ConsoleInput.savingFirstNameUser = scanner.next();
                ConsoleInput.savingLastNameUser = scanner.next();
                //ConsoleInput.savingListUser = scanner.next();
                //ConsoleInput.savingRegionUser = new Region()
                userView.save();
            } else if(subproblem.equals("Удалить")) {
                ConsoleInput.deleteUser = scanner.next();
                userView.deleteById();
            } else if(subproblem.equals("Изменить")) {
                ConsoleInput.updateIdUser = scanner.next();
                ConsoleInput.updateFirstNameUser = scanner.next();
                ConsoleInput.updateLastNameUser = scanner.next();
                //ConsoleInput.updateListUser = scanner.next();
                //ConsoleInput.updateRegionUser = scanner.next();
                userView.update();
            }
        }
    }

}
