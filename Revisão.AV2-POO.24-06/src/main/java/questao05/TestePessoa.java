package questao05;

/* Qual será a saída quando o programa for executado?
    A) Meu nome é Carlos
  X B) Meu nome é Carlos seguido de Minha matrícula é 12345
    C) Meu nome é Estudante seguido de Minha matrícula é 12345
    D) Meu nome é Pessoa seguido de Minha matrícula é 12345
*/

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Estudante("Carlos", 12345);
        p.apresentar();
    }
}
