package questao05;

public class Estudante extends Pessoa{
    int matricula;

    Estudante(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    void apresentar() {
        super.apresentar();
        System.out.println("Minha matrícula é " + matricula);
    }

}
