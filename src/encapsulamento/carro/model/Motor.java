package encapsulamento.carro.model;

// retirado o public da classe Motor
// A classe Motor agora tem visibilidade de pacote (padrão)
// significa q ele não existe fora do pacote model
// estando encpasulado dentro da aplicação

class Motor {
    private final double litragem;
    private boolean ligado;

    Motor(double litragem) {
        this.litragem = litragem;
    }

    void ligar() {
        ligado = true;
    }

    void delisgar() {
        ligado = false;
    }

    double getFatorAceleracao() {
        return 0.9 * litragem;
    }

    public double getLitragem() {
        return litragem;
    }

    public boolean isLigado() {
        return ligado;
    }


}
