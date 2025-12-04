package record.produto.model;

public record Produto(String nome, double preco, double desconto) {

    public Produto {

        if (nome == null || nome.isBlank()) {
            throw new RuntimeException(" Nome não pode ser vazio!");
        }

        if (preco <= 0) {
            throw new RuntimeException(" Preco nao pode ser zero ou negativo");
        }

        if (desconto < 0 || desconto > 0.6) {
            throw new RuntimeException(" Desconto Inválido!");
        }
    }

    public double precoComDesconto() {
        return preco * (1 - desconto);
    }

    // metodo para clonar o objeto, possibilitando a troca dos valores dos atributos do objeto imutavel
    

    public Produto withNome(String nome) {
        return new Produto(nome, preco, desconto);
    }


    public Produto withPreco(double preco) {
        return new Produto(nome, preco, desconto);
    }

// pode ser com () ou sem ()
    public Produto withDesconto(double desconto) {
        return new Produto(nome(),preco(), desconto);
    }


}
