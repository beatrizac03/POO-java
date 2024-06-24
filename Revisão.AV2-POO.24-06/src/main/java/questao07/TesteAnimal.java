package questao07;

/*O que acontecerá se o comentário na linha // a.latir(); for removido?
    A) O programa compilará e executará normalmente, imprimindo Cachorro
    comendo seguido de Cachorro latindo.
    B) O programa compilará, mas lançará uma exceção em tempo de execução.
 X  C) O programa não compilará devido a um erro de compilação.
    D) Nenhuma das opções acima.
 */

/* a.latir não funciona, pois não existe método latir em Animal*/

public class TesteAnimal {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        a.comer();
//        a.latir();
    }
}
