package composicao.umpraum;

import java.util.Objects;

// sem o publicm, a classe senha será vista somente
// dentro do pacote umpraum
public class Senha {
    int id;
    String valor;

    public Senha(int id, String valor) {
        this.id = id;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Senha senha = (Senha) o;
        return id == senha.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
