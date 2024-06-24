package questao10;

public class Mamifero extends Animal {
    int idade;

    Mamifero(String nome, int idade) {
        super(nome);
        this.idade = idade;
        apresentar();
    }

    void apresentar() {
        super.apresentar();
        System.out.println("Mamífero: " + nome + ", Idade: " + idade);
    }
}
