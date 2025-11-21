package composicao.umpraum;

/*
 * Aqui temos um exemplo de relacionamento 1 para 1
 * 1 senha para 1 usuario
 *
 * */

public class TesteUmPraUm {
    static void main() {
        Senha senha = new Senha(1, "#Senha123");
        Usuario usuario = new Usuario(
                3,
                "Leonardo",
                "leonardo@gmail.com",
                senha
        );


        System.out.println(usuario.senha.valor);
    }

}
