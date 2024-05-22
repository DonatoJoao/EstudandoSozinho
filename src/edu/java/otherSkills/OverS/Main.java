package edu.java.otherSkills.OverS;

public class Main {
    public static void main(String[] args) {
        ExemploSobrecarga teste = new ExemploSobrecarga();
        teste.sobrecarga("Olá");
        teste.sobrecarga(1000);
        ExemploOverriding e = new ExemploOverriding();
        e.testeOverrinding();
        teste.testeOverrinding();




    }
}
