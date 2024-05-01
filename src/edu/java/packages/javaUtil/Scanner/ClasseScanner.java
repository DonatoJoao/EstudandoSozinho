package edu.java.packages.javaUtil.Scanner;

import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt()); //1
        System.out.println(s.nextInt()); //2
        System.out.println(s.next()); //red
        System.out.println(s.next()); //blue
        s.close();



    }
}
