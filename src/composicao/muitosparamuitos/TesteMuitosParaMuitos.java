package composicao.muitosparamuitos;

public class TesteMuitosParaMuitos {

    static void main() {
        Perfil admin = new Perfil(1, "Admin");
        Perfil aluno = new Perfil(2, "Aluno");
        Perfil tutor = new Perfil(2, "Tutor");

        Usuario u1 = new Usuario(
                1,
                "Joao PEdro",
                "jp@gmail.com");

        Usuario u2 = new Usuario(
                2,
                "Maria Paula",
                "mp@email.com");

        u1.perfis.add(admin);
        u1.perfis.add(aluno);

        u2.perfis.add(admin);
        u2.perfis.add(aluno);
        u2.perfis.add(tutor);

        System.out.println(u1);
        System.out.println(u2);



    }
}
