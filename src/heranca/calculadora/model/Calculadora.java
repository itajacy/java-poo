package heranca.calculadora.model;

public interface Calculadora {

    double pi = 3.14;



    int somar(int a, int b);


    // SE USAR A PALAVRA default, nao será obrigatorio implementar esse comportamento na
    // classe que implementa essa interface
    // criando um comportamento padrao
    default int subtrair(int a, int b) {
        validar(a,b);
        return a - b;
    }

    private void validar(int a, int b) {
        if (a < 0 || b < 0){
            throw new RuntimeException("Números negativos!");
        }
    }


}
