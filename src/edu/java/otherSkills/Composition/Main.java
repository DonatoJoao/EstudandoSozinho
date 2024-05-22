package edu.java.otherSkills.Composition;

public class Main {
    public static void main(String[] args) {


        //Criando 3 objetos dentro um (Pessoa, Emprego, Endereco[implícito no construtor da classe Pessoa])
        Pessoa pessoa = new Pessoa("João", "Desenvolvedor", 10000); 
        
        System.out.println(pessoa.getEmprego().getSalario());
        pessoa.getEndereco().setCidade("Itanhaém");
        System.out.println(pessoa.getEndereco().getCidade());

    }
}
