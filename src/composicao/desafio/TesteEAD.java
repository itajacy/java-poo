package composicao.desafio;

public class TesteEAD {
    static void main() {
        CatalogoCursos catalogo = new CatalogoCursos();
        Curso curso = catalogo.listarTodos().getFirst();

        Aluno aluno = new Aluno("Joao Pedro", "jp@gmail.com");

        // Relacionamento bidirecional
        InscricaoCurso novaInscricao = new InscricaoCurso(curso, aluno);
//        aluno.inscricoes.add(novaInscricao);

        novaInscricao.progressos.add(
                new ProgressoAula(
                        curso.modulos.getFirst().aulas.getFirst(),
                        true
                ));

         novaInscricao.progressos.add(
                new ProgressoAula(
                        curso.modulos.getFirst().aulas.get(1),
                        true
                ));


        System.out.println(curso.nome);
        System.out.println(curso.getDuracaoTotal());

        // quantidades de progressos na novainscricao
        System.out.println(novaInscricao.progressos.size());


    }
}
