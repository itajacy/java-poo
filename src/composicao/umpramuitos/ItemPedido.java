package composicao.umpramuitos;

public class ItemPedido {
    int id;
    Produto produto;
    double preco;
    int quantidade;


    public ItemPedido(int id, Produto produto) {
        this(id, produto,  1);
    }

// esse construtor receber o preco vindo diretamente do produto
    public ItemPedido(int id, Produto produto, int quantidade) {
//        this.id = id;
//        this.produto = produto;
//        this.preco = produto.preco;
//        this.quantidade = quantidade;
        this(id, produto, produto.preco, quantidade);
    }

    // neste construtor voce deve entrar com o preco
    public ItemPedido(int id, Produto produto, double preco, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return this.preco * this.quantidade;
    }
}
