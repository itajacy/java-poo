package heranca.jogo.teste;

import heranca.jogo.model.Direcao;
import heranca.jogo.model.Heroi;
import heranca.jogo.model.Jogador;

public class TesteJogo {
    static void main() {

        Jogador j1 = new Heroi(20,50);
        Jogador j2 = new Jogador(23,50);

//        System.out.println(j1.mover(Direcao.NORTE));

        j1.atacar(j2);



        System.out.println(j1);
        System.out.println(j2);

    }
}
