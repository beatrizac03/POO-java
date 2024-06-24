package questao09;

/* Qual será a saída quando o programa for executado?
  X A) Base: 10 seguido de Derivada: 20 seguido de Acesso direto ao valor na classe Base: 10
    B) Base: 10 seguido de Derivada: 20 seguido de Acesso direto ao valor na classe Base: 20
    C) Base: 10 seguido de Derivada: 10 seguido de Acesso direto ao valor na classe Base: 10
    D) Base: 10 seguido de Derivada: 20 seguido de Acesso direto ao valor na classe Base: 0
*/

public class TesteValores {
    public static void main(String[] args) {
        Base b = new Derivada(10, 20);
        b.mostrarValor();
        System.out.println("Acesso direto ao valor na classe Base: " + b.valor);
    }
}
