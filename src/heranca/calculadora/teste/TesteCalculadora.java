package heranca.calculadora.teste;

import heranca.calculadora.model.Calculadora;
import heranca.calculadora.model.CalculadoraHP;

public class TesteCalculadora {
    static void main() {

        CalculadoraHP hp = new CalculadoraHP();

        System.out.println(hp.somar(3,4));
        System.out.println(hp.subtrair(-1,4));

//        Calculadora.pi = 7;

        System.out.println(Calculadora.pi);

    }
}
