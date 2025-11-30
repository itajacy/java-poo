package heranca.jogo.model;

/*
* Enum em java
* enumeraçoes para definir um conjunto especifico
* */

//@SuppressWarnings("all")
public class Jogador {
    private final String nome;
    private int x = 0;
    private int y = 0;
    private int passo = 1;
    private double vida = 100;
    private double forca = 0.5; // quanto de dano o jogador dá em um ataque

    public Jogador() {
        this(0,0,1, 0.5, "Jogador");
    }

    public Jogador(int x, int y) {
       this(x,y,1, 0.5,"Jogador");
    }

    public Jogador(int x, int y, int passo, double forca, String nome) {
        this.x = x;
        this.y = y;
        this.passo = passo;
        this.forca = forca;
        this.nome = nome;
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);  // distancia entre os jogadores eixo x
        int deltaY = Math.abs(y - oponente.y);  // distancia entre os jogadores eixo y

        boolean ataqueVertical = (deltaX == 0 && deltaY <= passo);
        boolean ataqueHorizontal = (deltaY == 0 && deltaX <= passo);

        if (ataqueVertical || ataqueHorizontal) {
            oponente.vida -= forca;
            return  true;
        }
            return  false;

    }


    public boolean mover(Direcao direcao) {
        int xAnterior = x;
        int yAnterior = y;

        if (direcao == Direcao.NORTE) {
//            y =  (y - passo) >= 0 ? (y - passo) : 0;
            y = Math.max(y - passo, 0);
            return  yAnterior != y;
        } else if (direcao == Direcao.SUL) {
            y = Math.min(y + passo, 100);
            return  yAnterior != y; // ele andou se o yAnterior for diferente do y
        } else if (direcao == Direcao.OESTE) {
            x = Math.max(x - passo, 0);
            return xAnterior != x;
        } else if (direcao == Direcao.LESTE) {
            x = Math.min(x + passo, 100);
            return xAnterior != x;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + "{" +
                "x=" + x +
                ", y=" + y +
                ", vida=" + vida +
                '}';
    }
}
