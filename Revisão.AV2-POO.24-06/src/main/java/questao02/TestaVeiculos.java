package questao02;

/* Qual será a saída quando o programa for executado?
A) Carro seguido de Carro
B) Veiculo seguido de Veiculo
C) Carro seguido de Veiculo   X
D) Veiculo seguido de Carro */

public class TestaVeiculos {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Carro();
        meuVeiculo.mostrarTipo();
        System.out.println(meuVeiculo.tipo);  // variáveis não são polimórficas, não vai dar overriding

        Carro car = new Carro();
        System.out.println(car.tipo);
    }
}
