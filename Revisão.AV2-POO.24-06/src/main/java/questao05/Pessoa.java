package questao05;

public class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void apresentar() {
        System.out.println("Meu nome é " + nome);
    }
}
