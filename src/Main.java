import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Conceito de abstração pegando o problema e destrinchando através de classes e
        // instanciando através de objetos

        Cursos curso1 = new Cursos();
        curso1.setTitulo("curso JAVA");
        curso1.setDescricao("Curso para iniciantes na linguagem Java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("Curso intermediario de JavaScript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria JAVA");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
