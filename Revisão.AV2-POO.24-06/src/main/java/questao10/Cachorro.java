package questao10;

public class Cachorro extends Mamifero{
    String raca;

    Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
        apresentar();
    }

    void apresentar() {
        super.apresentar();
        System.out.println("Cachorro: " + nome + ", Idade: " + idade + ", Raça: " + raca);
    }
}
