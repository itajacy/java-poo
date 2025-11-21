package composicao.umpramuitos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int id;
    final List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    // valor total do pedido, dentro da classe
    public double getValorTotal() {
        double total = 0;
        for (var item: this.itens) {
            total += item.getValorTotal();
        }
        return total;
    }

}
