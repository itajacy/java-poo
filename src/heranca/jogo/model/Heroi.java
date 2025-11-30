package heranca.jogo.model;

//Heroi é um Jogador
// os construtores não são herdados
public class Heroi extends Jogador {

//        public Heroi() {
//            super(); // chamando o construtor da classe Pai
//        }

    public Heroi() {

    }

    public Heroi(int x, int y) {
        super(x,y,3,1.5);
    }



}
