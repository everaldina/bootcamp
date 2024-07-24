import java.time.LocalDate;

import bootcamp.model.Curso;
import bootcamp.model.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        // criando cursos
        Curso curso1 = new Curso("Java", "Curso de Java", 40);
        Curso curso2 = new Curso("Python", "Curso de Python", 50);

        // exibindo os cursos
        System.out.println(curso1);
        System.out.println(curso2);


        // criando mentorias
        Mentoria mentoria1 = new Mentoria("Java", "Mentoria de Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Python", "Mentoria de Python", LocalDate.now());

        // exibindo as mentorias
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
