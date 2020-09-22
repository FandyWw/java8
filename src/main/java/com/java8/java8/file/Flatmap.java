package com.java8.java8.file;

import com.java8.java8.file.user.*;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://blog.csdn.net/wb_zjp283121/article/details/89057283
public class Flatmap {
    public static void main(String[] args) {
//        List<User> uList = new ArrayList<>();
//        User u1 = new User();
//        u1.setAddr("a1;a2;a3;a4;a5");
//
//        User u2 = new User();
//        u2.setAddr("b1;b2;b3;b4;b5");
//
//        uList.add(u1);
//        uList.add(u2);
//
//        List<String> addrList = uList.stream().map(x -> x.getAddr()).flatMap(x-> Arrays.stream(x.split(";"))).collect(Collectors.toList());
//        //或者
//        List<String> ridStrList = uList.stream().map(x -> x.getAddr()).map(x -> x.split(";")).flatMap(Arrays::stream).collect(Collectors.toList());
//        System.out.println(addrList);
//        System.out.println(ridStrList);
//        Arrays.stream(new String[]{"a","ab","abc"})
//                .map(s->{
//                    System.out.println("123");
//                    return Arrays.asList(s);
//                })
//                .flatMap(l->l.stream())
//                .forEach(System.out::println);



        System.out.println(getAllWriteTopics());
    }
    public static List<String> getAllWriteTopics(){
        Map<String,List<String>> map = new HashMap<>();
        List temp = new ArrayList<>();
        temp.add("all");
        map.put("aa",temp);
        map.put("bb",temp);
        map.put("cc",temp);
        map.put("dd",temp);
        map.put("ee",temp);
        return IntStream.rangeClosed(1,3).boxed().map(shared->map.entrySet().stream().
                flatMap(entry->entry.getValue().stream().map(userType->new StringBuilder().append(shared).toString()))
                .collect(Collectors.toList())).flatMap(Collection::stream).collect(Collectors.toList());
    }
}
