package encapsulamento.basico;


public class TesteUsuario {
    static void main() {
        Usuario usuario = new Usuario();

        // alterando os atributos do Usuario através de métodos
        // fazer isso é uma forma de encapsulamento

        // não é possível mais acessar o setId, pois agora o id é final
//        usuario.setId(UUID.randomUUID());
        usuario.setNome("Leonardo");
        usuario.setEmail("leonargomleitao@gmail.com");

        System.out.println(usuario);

        System.out.println(usuario.getId());
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
    }
}
