package composicao.umpramuitos;

@SuppressWarnings("all")
public class TesteUmPraMuitos {
    static void main() {
        Produto produto1 = new Produto(100, "Notebook", 7865.97);
        ItemPedido item1 = new ItemPedido(1, produto1, 2);

        Produto produto2 = new Produto(310, "Steam Deck", 3980.97);
        ItemPedido item2 = new ItemPedido(2, produto2, 3);

        Pedido pedido = new Pedido(1000);
        pedido.itens.add(item1);
        pedido.itens.add(item2);

        System.out.println(pedido.itens.get(1).produto.nome);

        System.out.println(pedido.getValorTotal());


        pedido.itens.clear();
        System.out.println(pedido.itens.size());


    }
}
