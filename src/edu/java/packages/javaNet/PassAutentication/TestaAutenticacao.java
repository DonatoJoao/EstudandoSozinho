package edu.java.packages.javaNet.PassAutentication;

import java.util.Scanner;

public class TestaAutenticacao {
    public static void main(String[] args) {
        Autentication senha = new Autentication("João", "1234");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String validandoSenha = scanner.next();
            if (senha.getPassword().equals(validandoSenha)){
                System.out.println("Acesso autorizado");
            } else {
                System.out.println("Senha inválida");
            }

    }
}
