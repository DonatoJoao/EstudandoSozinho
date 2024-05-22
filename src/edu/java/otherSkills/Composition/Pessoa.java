package edu.java.otherSkills.Composition;

public class Pessoa {

    //Composição é quando temos um objeto de fora classe dentro desta
    // como aqui: os objetos emprego e endereco são das classes Emprego e Endereco, que estão dentro da classe Pessoa...
    private String nome; //atributo da classe Pessoa
    private Emprego emprego; //atributo da classe Emprego
    private Endereco endereco; //atributo da classe Endereco


    //Aprendi a criar um objeto instanciando direto o atributo da classe composta,
    //sem criar primeiro o objeto e depois settar seu atributo
    //Antes eu aprendi:
    // Pessoa pessoa = new Pessoa();
    // Endereco endereco = new Endereco();
    // pessoa.setEndereco(endereco);
    // compondo dessa maneira as classes



    Pessoa(String nome, String cargo, double salario){
        //fazendo composição desde modo, não é necessário instanciar cada objeto
        // dentro da Main class (como exemplo acima)
        //Assim, é possível em uma linha, criar esses 3 objetos de uma vez (Pessoa, Emprego e Endereco)
        // e já settando alguns parâmetros necessários para cada regra de negócio
        this.emprego = new Emprego(cargo, salario); //parâmetros obrigatórios do construtor
        this.endereco = new Endereco(); //chamando construtor default
    }

    public String getNome() {
        return nome;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
