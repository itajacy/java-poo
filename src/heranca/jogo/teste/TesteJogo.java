package heranca.jogo.teste;

import heranca.jogo.model.Direcao;
import heranca.jogo.model.Jogador;

public class TesteJogo {
    static void main() {

        Jogador j1 = new Jogador(25,50);
        Jogador j2 = new Jogador(26,50);

//        System.out.println(j1.mover(Direcao.NORTE));

        j1.atacar(j2);



        System.out.println(j1);
        System.out.println(j2);

    }
}
