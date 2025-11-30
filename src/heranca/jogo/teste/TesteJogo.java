package heranca.jogo.teste;

import heranca.jogo.model.Direcao;
import heranca.jogo.model.Heroi;
import heranca.jogo.model.Monstro;

public class TesteJogo {
    static void main() {

        Heroi heroi = new Heroi(21,50);
//        Jogador monstro = new Monstro(21,50);
        Monstro monstro = new Monstro(23,50);  // Jogador dá menos dano que Monstro

//        System.out.println(j1.mover(Direcao.NORTE));

        boolean heroiAcertou =  heroi.atacar(monstro);
        System.out.println(heroiAcertou ? heroi.gritar() : "");
         boolean monstroAcertou =  monstro.atacar(heroi);
        System.out.println(monstroAcertou ? monstro.gritar() : "");




        System.out.println(heroi);
        System.out.println(monstro);

    }
}
