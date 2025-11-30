package encapsulamento.carro.model;


public class Carro {

    private Motor motor;
    private final double velocidadeMaxima;
    private double velocidade = 0;



    public Carro() {
        this(1,180);
    }

    public Carro(double litragem, double velocidadeMaxima) {
        this.motor = new Motor(litragem);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar() {
        motor.ligar();
    }

    public void desligar() {
        motor.delisgar();
    }

    public void acelerar() {
        if (!motor.isLigado()) {
            return;
        }

        if (velocidade >= velocidadeMaxima) {
            return;
        }

        double incrementoBase = 10;
        double incremento = incrementoBase * motor.getFatorAceleracao();

        double novaVelocidade = velocidade + incremento;

        // fornece o menor valor entre a novaVelocidade e a velocidadeMaxima
        velocidade = Math.min(novaVelocidade, velocidadeMaxima);

    }

    public void frear() {
        if (velocidade <= 0) {
            return;
        }

        double decremento = 20;
        double novaVelocidade = velocidade - decremento;

        velocidade = Math.max(novaVelocidade, 0);
    }


    public double getVelocidade() {
        return velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidadeMaxima=" + velocidadeMaxima +
                ", velocidade=" + velocidade +
                '}';
    }
}
