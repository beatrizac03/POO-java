package questao10;

public class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
        apresentar();
    }

    void apresentar() {
        System.out.println("Animal: " + nome);
    }
}
