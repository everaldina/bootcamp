import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bootcamp.model.Bootcamp;
import bootcamp.model.Conteudo;
import bootcamp.model.Curso;
import bootcamp.model.Dev;
import bootcamp.model.Mentoria;

public class App {

    public static void printDevInf(Dev [] devs) {
        for (Dev dev : devs) {
            System.out.println("\nDev: " + dev.getNome());
            dev.printConteudosConcluidos();
            dev.printConteudosInscritos();
            dev.calcularTotalXp();
        }
    }

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

        // criar um bootcamp
        Bootcamp bootcamp = new Bootcamp("Introdução a programação", "Bootcamp de Java e Python");

        // adicionar cursos e mentorias ao bootcamp
        for (Conteudo c : conteudo) {
            bootcamp.adicionarConteudo(c);
        }

        bootcamp.printConteudos();


        // criar devs
        Dev dev1 = new Dev("José");
        Dev dev2 = new Dev("Maria");
        Dev dev3 = new Dev("João");

        Dev [] devs = {dev1, dev2, dev3};

        // listar xp e conteudos inscritos
        printDevInf(devs);

        // inscrever devs no bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);
        dev3.inscreverBootcamp(bootcamp);


        // listar xp e conteudos inscritos
        printDevInf(devs);


        // progredir devs
        dev1.progredir();
        dev2.progredir();
        dev3.progredir();
        dev1.progredir();
        dev1.progredir();
        dev3.progredir();

        // listar xp e conteudos inscritos
        printDevInf(devs);
        



    }
}
