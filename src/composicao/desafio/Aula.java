package composicao.desafio;

import java.util.UUID;

public class Aula {
    UUID id;
    String nome;
    int duracaoEmSegundos;


    public Aula(String nome, int duracaoEmSegundos) {
        this(UUID.randomUUID(),nome,duracaoEmSegundos);
    }


    public Aula(UUID id, String nome, int duracaoEmSegundos) {
        this.id = id;
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", duracaoEmSegundos=" + duracaoEmSegundos +
                '}';
    }
}
