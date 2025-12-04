package record.pessoa.model;

import java.util.Objects;

public record Pessoa(String nome, int idade) {

}


// aula sobre records
//public class Pessoa {
//    private final String nome;
//    private  final int idade;
//
//    public Pessoa(String nome, int idade) {
//        this.nome = nome;
//        this.idade = idade;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public int getIdade() {
//        return idade;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Pessoa pessoa = (Pessoa) o;
//        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, idade);
//    }
//
//    @Override
//    public String toString() {
//        return "Pessoa{" +
//                "nome='" + nome + '\'' +
//                ", idade=" + idade +
//                '}';
//    }
//}
