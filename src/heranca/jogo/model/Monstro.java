package heranca.jogo.model;


public class Monstro extends Jogador{

    public Monstro() {
 // implicitamente ele está chamando o construtor padrao da classe pai
        //         super();  use assim somente se na classe pai não houver um construtor padrao

    }

    public Monstro(int x, int y) {
        super(x,y,1,5, "Monstro");
    }



}
