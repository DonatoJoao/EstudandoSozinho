package edu.java.packages.javaLang.ClasseSystem;

import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("abc"); //imprime sem pular linha
        System.out.print("abc");
        System.out.print("abc\n"); //add linha dentro da String
        System.out.println("abc");


        //this output stream is used to display error messages or other information
        // that should come to the immediate attention of a user even if the principal output stream
        System.err.println("Erro");
        System.err.println("Acesso ilegal");
        String texto = new String(String.valueOf(System.in));
        System.out.println(texto);
    }
}
