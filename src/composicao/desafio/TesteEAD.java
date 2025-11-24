package composicao.desafio;

public class TesteEAD {
    static void main() {
        CatalogoCursos catalogo = new CatalogoCursos();
        Curso curso = catalogo.listarTodos().getFirst();

        System.out.println(curso.nome);
        System.out.println(curso.getDuracaoTotal());

    }
}
