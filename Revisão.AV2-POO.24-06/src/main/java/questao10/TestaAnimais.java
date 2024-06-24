package questao10;
/* Qual será a saída quando o programa for executado?
  X A) Animal: Rex seguido de Animal: Rex seguido de Mamífero: Rex, Idade: 5 seguido de
    Animal: Rex seguido de Mamífero: Rex, Idade: 5 seguido de Cachorro: Rex, Idade: 5,
    Raça: Labrador
    B) Animal: Rex seguido de Mamífero: Rex, Idade: 5 seguido de Cachorro: Rex, Idade: 5,
    Raça: Labrador
    C) Animal: Rex seguido de Mamífero: Rex, Idade: 5 seguido de Animal: Rex seguido de
    Mamífero: Rex, Idade: 5 seguido de Cachorro: Rex, Idade: 5, Raça: Labrador
    D) Animal: Rex seguido de Mamífero: Rex, Idade: 5 seguido de Cachorro: Rex, Idade: 5,
    Raça: Labrador seguido de Animal: Rex
*/

public class TestaAnimais {
    public static void main(String[] args) {
        Animal a = new Cachorro("Rex", 5, "Labrador");
    }
}
