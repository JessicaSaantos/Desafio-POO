import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Conceito de abstração pegando o problema, destrinchando através de classes e
        // instanciando através de objetos

        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso JAVA");
        curso1.setDescricao("Curso para iniciantes na linguagem Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Curso intermediario de JavaScript");
        curso2.setCargaHoraria(12);

        // Conteudo conteudo = new Cursos(); Conceito de polimorfismo onde é possivel
        // instanciar um objeto de diversas formas

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria JAVA");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp FullStack Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessica: " + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("Conteúdos Inscritos Jessica: " + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jessica: " + devJessica.getConteudosConcluidos());
        System.out.println("XP: " + devJessica.calcularTotalXp());
    }
}
