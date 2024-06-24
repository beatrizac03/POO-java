package questao01;

/* Qual será a saída quando o programa for executado?
A) Som de animal
B) Latido  X
C) Miau
D) Nenhuma das opções acima
*/

public class TesteAnimais {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom();
    }
}
