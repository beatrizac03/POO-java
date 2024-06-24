package questao09;

public class Derivada extends Base{
    int valor;

    Derivada(int valorBase, int valorDerivada) {
        super(valorBase);
        this.valor = valorDerivada;
    }

    void mostrarValor() {
        super.mostrarValor();
        System.out.println("Derivada: " + valor);
    }
}
