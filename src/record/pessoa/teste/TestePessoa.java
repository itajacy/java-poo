package record.pessoa.teste;

import record.pessoa.model.Pessoa;

public class TestePessoa {
    static void main() {
        Pessoa p1 = new Pessoa("Joao", 40);
        Pessoa p2 = new Pessoa("Joao", 40);

        System.out.println(p1);

//        System.out.println(p1.getNome());
//        System.out.println(p1.getIdade());

        System.out.println(p1.nome());
        System.out.println(p1.idade());
        System.out.println(p1.equals(p2));

    }

}
