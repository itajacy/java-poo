package record.produto.teste;

import record.produto.model.Produto;

public class TesteProduto {
    static void main() {

        Produto p1 = new Produto("Steam Machimne", 6500, 0.40);
        Produto p2 = p1.withNome("Steam Machine 2025");

        System.out.println(p1.preco());
        System.out.println(p1.precoComDesconto());


        System.out.println(p1.nome());
        System.out.println(p2.nome());
        System.out.println(p2.preco());
        System.out.println(p2.precoComDesconto());

        System.out.println(p2.withDesconto(0.2));
        System.out.println(p2.withPreco(8000));


    }
}
