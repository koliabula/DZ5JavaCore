//package org.example;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
////        FileWriter fileWriter = new FileWriter("src/main/resources/file.txt");
////        fileWriter.write(Arrays.toString(array));
////        fileWriter.close();
//
//        FileWriter fileWriter1 = new FileWriter("src/main/resources/file2.txt");
////        fileWriter1.write("[");
//        for (int i = 0; i < array.length; i++){
//            fileWriter1.write(String.valueOf(array[i]));
//            if(i<array.length-1)   fileWriter1.write("0");
//        }
//
////        fileWriter1.write("]");
//        fileWriter1.close();
//
//
//
//
//    }
//
//
//    public static int[] readFile(String path) throws IOException {
//        FileReader reader = new FileReader(path);
//        ArrayList<Integer> array = new ArrayList<>();
//        int n;
//        while ((n=reader.read()) != -1){
//            if(n != 0){
//                array.add(n);
//            }
//        }
//
//
//        return new int[0];
//    }
//}