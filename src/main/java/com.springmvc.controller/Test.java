package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Pear");
        list.add("Orange");

      //  List<String> result = list.stream().map(e -> e.getsalary).collect(Collectors.tomap);

        //predicate write

        // salary figures offering --> how many employees received particular 20k --> collections.groupingby

        // convert list into treemap object --> map

        // employee --> override equals hashcode method..in equals set true always hashcode always 1 --> adding elements to hascode
        // map.put (e1, 1000),map.put(e2, 2000)--> size, false
        



       // employee - id, name , sal , age
        //filter list find out baasd on sal below 5000 bucks



    }
}
