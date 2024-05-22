package edu.java.otherSkills.Composition;

public class Emprego {

    private String cargo;
    private double salario;
    public Emprego(String cargo,double salario) { //construtor gerando a obrigação de criar objetos com esses parâmetros
        this.cargo = cargo;
        this.salario = salario;

    }
    public double getSalario() {
        return salario;
    }
}
