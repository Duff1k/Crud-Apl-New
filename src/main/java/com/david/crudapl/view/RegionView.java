package com.david.crudapl.view;

import Console.ConsoleInput;
import com.david.crudapl.controller.RegionController;
import com.david.crudapl.model.Region;

import java.util.List;
import java.util.Scanner;

public class RegionView {
    public RegionController rc = new RegionController();

    public void getAll(){
        List<Region> regions = rc.getAll();
        regions.forEach(r -> {
            System.out.println(r);
        });
    }

    public void getById(){
        Region region = rc.getById(ConsoleInput.idRegion);
        System.out.println(region);
    }

    public void save(){
        rc.save(ConsoleInput.savingIdRegion, ConsoleInput.savingReg);
        getAll();
    }

    public void update(){
        rc.update(ConsoleInput.updateIdRegion, ConsoleInput.updateReg);
        getAll();

    }

    public void deleteById(){
        rc.deleteById(ConsoleInput.deleteIdRegion);
        getAll();

    }

    public static Long inputId(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }

    public static String inputRegion(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
