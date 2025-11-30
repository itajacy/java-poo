package heranca.jogo.teste;

import heranca.jogo.model.Direcao;
import heranca.jogo.model.Heroi;
import heranca.jogo.model.Jogador;
import heranca.jogo.model.Monstro;

public class TesteJogo {
    static void main() {

        Jogador heroi = new Heroi(20,50);
//        Jogador monstro = new Monstro(21,50);
        Jogador monstro = new Jogador(21,50);  // Jogador dá menos dano que Monstro

//        System.out.println(j1.mover(Direcao.NORTE));

        heroi.atacar(monstro);
        monstro.atacar(heroi);


        System.out.println(heroi);
        System.out.println(monstro);

    }
}
