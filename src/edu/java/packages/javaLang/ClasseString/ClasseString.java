package edu.java.packages.javaLang.ClasseString;

import java.lang.*;

public class ClasseString {

    public static void main(String[] args) {

        String str = "abc"; //Strings are constant (public final class String); their values cannot be changed after they are created.
        System.out.println(str);
        //is equivalent to:
        char data[] = {'a','b','c'};
        String string = new String(data);
        System.out.println(data[0] + " posição 1"); //a
        System.out.println(data[1] + " posição 2"); //b
        System.out.println(data[2] + " posição 3"); //c
        //System.out.println(data[3]); Exception: Index 3 out of bounds for length 3

        System.out.println("***************");
        System.out.println("data.length: " + data.length); //3
        System.out.println("string.length: " + string.length()); //3
        System.out.println("***************");

        //Compares this string to the specified object.
        System.out.println("str.equals(string) " + str.equals(string)); //3
        System.out.println("str.compareTo(string) " + str.compareTo(string)); //3
        /*
         compareTo(String anotherString)
         Compares two strings lexicographically.
         The result is a negative integer if this String object lexicographically precedes the argument string.
         The result is a positive integer if this String object lexicographically follows the argument string.
         The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
         */
        String strDiferente = "def";
        System.out.println("str.compareTo(strDiferente) " + str.compareTo(strDiferente)); //-3
        System.out.println("str.equals(strDiferente) " + str.equals(strDiferente)); // false
        System.out.println("str.equals(string) " + str.equals(string)); //true
        String str3 = "ghijklmnopqrstu...";
        System.out.println("str.compareTo(str3) " + str.compareTo(str3)); //-6
        System.out.println("str3.compareTo(str) " + str3.compareTo(str)); //6
        System.out.println("strDiferente.compareTo(str3) " + strDiferente.compareTo(str3)); //-3
        System.out.println("********************");


        System.out.println("******compareToIgnoreCase(String str)**********");
        //Compares two strings lexicographically, ignoring case differences.
        System.out.println(str.compareToIgnoreCase(strDiferente)); //-3
        System.out.println(str.compareToIgnoreCase(str3)); //-6
        System.out.println("*****************");

        System.out.println("**********concat(String str)***********");
        String stringConcatenada = str.concat(strDiferente);
        System.out.println(stringConcatenada); //abcdef


        System.out.println("**********indexOf(String str)**************");
        System.out.println(str.indexOf("a")); //0
        System.out.println(str.indexOf("b")); //1
        System.out.println(str.indexOf("c")); //2
        System.out.println("********************");
        System.out.println(str.intern()); //abc
        System.out.println(str3.intern()); //ghijklmnopqrstu...
        System.out.println("************************");
        System.out.println(str.isEmpty()); //false
        String nome = "";
        System.out.println(nome.isEmpty()); //true

        System.out.println("***********boolean matches(String regex)**************");
        System.out.println(str.matches("abc")); //true
        System.out.println(str.matches(str3)); //false
        System.out.println(str.matches("a")); //false
        System.out.println(str.matches("ab")); //false
        System.out.println(str.matches(string)); //true
        System.out.println(str3.matches("abc"));
        //Returns:
        //true if, and only if, this string matches the given regular expression

        System.out.println("************boolean contains(CharSequence s)*************");
        System.out.println(str.contains("a"));
        System.out.println(str3.contains("."));
        System.out.println(str3.contains(".."));
        System.out.println(str3.contains("a")); //false
        System.out.println(str3.contains("mnop"));
        System.out.println(str3.contains("ponm")); //false

    }

}
