package composicao.muitosparamuitos;

public class Perfil {
    int id;
    String nome;

    // se fosse fazer uma exemplo de MUITOS PARA MUITOS teria que ter
    // uma lista de Usuarios atrelada ao Perfil e seria como na linha abaixo
    // para termos uma relação Bidirecional de muitos para muitos
    // List<Usuario> usuarios = new ArrayList<>();



    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
