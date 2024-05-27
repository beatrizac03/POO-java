public class Jogador {
    private final int maxvidas = 3;
    private int num=0, vidas=0;
    static boolean alerta = false;
    static int qtJogadores = 0;

    public Jogador(int num) {
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador número %d criado%n", num);
    }

    public int getvidas() {
        return this.vidas;
    }

    public void addVidas() {
        if(this.vidas < maxvidas) {
            this.vidas++;
        }
    }

    public void info() {
        System.out.printf("%nJogador: %d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", alerta ? "Sim" : "Não");
        System.out.printf("%nJogadores: %d", qtJogadores);
        System.out.printf("%n-----------------------------------------------");
    }

}
