package composicao.desafio;

import java.util.UUID;

public class ProgressoAula {
    UUID id;
    Aula aula;
    boolean concluida;

    // construtor 1
    // esse construtor chama o construtor 2
    public ProgressoAula(Aula aula) {
        this(aula,false);
    }

    // construtor 2
    // esse construtor chama o construtor 3
    public ProgressoAula(Aula aula, boolean concluida) {
        this(UUID.randomUUID(),aula,concluida);
    }

    // construtor 3
    public ProgressoAula(UUID id, Aula aula, boolean concluida) {
        this.id = id;
        this.aula = aula;
        this.concluida = concluida;
    }
}
