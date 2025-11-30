package encapsulamento.basico;

// PRIMEIRO EXEMPLO DE ENCAPSULAMENTO

// martinfowler.com
// Anemic Domain Model
// https://martinfowler.com/bliki/AnemicDomainModel.html
// artigo de 2003

import java.util.UUID;

/*
Nesse exemplo de encapsulamento, pegamos os atributos e tornamos privados
e criamos métodos de acesso  get e set
 - A vantagem é que temos mais controle
  - temos a possibilidade de aplicar uma validação através dos métodos set
    como no exemplo do e-mail, e fazer que nessa validação sejam verificados
    os valores que serão colocados no atributo do objeto e aceitar ou não esse dado
 */

public class Usuario {
    private final UUID id;
    private String nome;
    private String email;

    public Usuario() {
        this(null);
    }


    public Usuario(UUID id) {
        this.id = id != null ? id : UUID.randomUUID();
    }



    public UUID getId() {
        return id;
    }

    // como o id agora é final, ele não deve ter mais a opção de
    // ser alterado. Restringindo mais o acesso ao atributo id
//    public void setId(UUID id) {
//        this.id = id;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    // criando um metodo eu posso validar ou
    // aplicar algum processo
    public void setEmail(String novoEmail) {
        if (novoEmail.contains("@")) {
            this.email = novoEmail;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
