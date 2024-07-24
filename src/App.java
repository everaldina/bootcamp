import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bootcamp.model.Conteudo;
import bootcamp.model.Curso;
import bootcamp.model.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        // criando cursos
        List<Conteudo> conteudo = new ArrayList<>();

        // criando cursos
        conteudo.add(new Curso("Java", "Curso de Java", 40));
        conteudo.add(new Curso("Python", "Curso de Python", 50));

        // criando mentorias
        conteudo.add(new Mentoria("Mentoria de Java", "Mentoria de Java", LocalDate.now()));
        conteudo.add(new Mentoria("Mentoria de Python", "Mentoria de Python", LocalDate.now()));

        // exibindo cursos e mentorias
        for (Conteudo c : conteudo) {
            System.out.println(c);
            System.out.println("- XP: " + c.calcularXp());
        }
    }
}
