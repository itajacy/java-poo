package polimorfismo.restaurante.model;


// CLASSE ASBSTRATA COMIDA
// ESSA CLASSE NAO TERA O CONSTRUTOR PADRAO
public abstract class Comida {

        private final String nome;
        private final double peso;

    public Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}
