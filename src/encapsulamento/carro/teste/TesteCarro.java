package encapsulamento.carro.teste;

import encapsulamento.carro.model.Carro;

public class TesteCarro {
    static void main() {
        Carro carro = new Carro(5.0, 245);
        // classe Motor não aparece aqui pq está como visibilidade somente dentro
        // do pacote model
        //Motor

        carro.ligar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();



        System.out.println(carro);

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println(carro);



    }

}
