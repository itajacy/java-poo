package composicao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CatalogoCursos {

    private final List<Curso> cursos = new ArrayList<>();

    public CatalogoCursos() {
        cursos.add(criarCursoJava());
        cursos.add(criarCursoReact());
        cursos.add(criarCursoJavaScript());
    }

    public List<Curso> listarTodos() {
        return Collections.unmodifiableList(cursos);
    }

    public Optional<Curso> buscarPorNome(String nome) {
        return cursos.stream()
                .filter(c -> c.nome.equalsIgnoreCase(nome))
                .findFirst();
    }

    // ========================= Cursos de exemplo-==================

    private Curso criarCursoJava() {
        Curso java = new Curso("Java Essencial");

        Modulo fundamentos = new Modulo("Fundamentos de Javaa ");
        fundamentos.aulas.add(new Aula("Introducao ao Java", 600));
        fundamentos.aulas.add(new Aula("Tipos primitivos e variaveis", 900));
        fundamentos.aulas.add(new Aula("Estruturas de Controle", 900));

        Modulo poo = new Modulo("Programacao Orientada a Objetos ");
        poo.aulas.add(new Aula("Classes e Objetos", 900));
        poo.aulas.add(new Aula("Encapsulamento e construtores", 900));
        poo.aulas.add(new Aula("Composicao e agregação", 900));

        java.modulos.add(fundamentos);
        java.modulos.add(poo);

        return java;

    }

    private Curso criarCursoReact() {
        Curso react = new Curso("React para iniciantes");

        Modulo basico = new Modulo("Primeiros passos com React");
        basico.aulas.add(new Aula("O que é React e por que usar", 600));
        basico.aulas.add(new Aula("Criando o primeiro componente", 900));

        Modulo componentes = new Modulo("Componentes e props");
        componentes.aulas.add(new Aula("Entendendo JSX", 600));
        componentes.aulas.add(new Aula("Props na pratica", 900));
        componentes.aulas.add(new Aula("Componentização e reutilização", 900));

        react.modulos.add(basico);
        react.modulos.add(componentes);

        return react;
    }

    private Curso criarCursoJavaScript() {
        Curso js = new Curso("JavaScript Moderno");


        Modulo fundamentos = new Modulo("Fundamentos de JavaScript");
        fundamentos.aulas.add(new Aula("Variaveis, le e const", 900));
        fundamentos.aulas.add(new Aula("Funções e escopo", 900));

        Modulo avancaodo = new Modulo("JavaScripto no dia a dia");
        avancaodo.aulas.add(new Aula("Arrays e métodos maais usados", 900));
        avancaodo.aulas.add(new Aula("Objetos e JSON", 900));
        avancaodo.aulas.add(new Aula("Instrodução a callbacks e promises", 900));

        js.modulos.add(fundamentos);
        js.modulos.add(avancaodo);

        return js;
    }

}
