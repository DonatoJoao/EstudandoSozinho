package edu.java.otherSkills.generics;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        LinkedList<String> strings= new LinkedList<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        stringList.add("Um");
        stringList.add("Dois");
        stringList.add("Três");
        System.out.println(stringList);
        stringList.add(0,"4 (Add numero no idex 0)");
        System.out.println(stringList);
        System.out.println(stringList.size());
        System.out.println(stringList.indexOf("Dois"));
        System.out.println(stringList.get(1));
        stringLinkedList.add("Um");
        stringLinkedList.add("Dois");
        System.out.println(stringLinkedList);
        strings.offer("Um");
        System.out.println(strings);
        hashtable.put(0, "João");
        hashtable.put(1, "Pri");
        hashtable.put(2, "Masha");
        System.out.println(hashtable);
        System.out.println(hashtable.get(0));
        System.out.println(hashtable.contains("Masha"));
        System.out.println("Digite um nome pra buscar na lista");
        String nome = scanner.next();
        boolean confere = hashtable.contains(nome);
        if (confere == true){
            System.out.println(nome);
        } else {
            System.out.println("Não encontrado");
        }

    }
}
