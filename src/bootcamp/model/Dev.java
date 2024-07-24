package bootcamp.model;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;


    public Dev(String nome) {
        this.nome = nome;
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.inscreverDev(this);
    }


    public void progredir() {
        Optional<Conteudo> c = this.conteudosInscritos.stream().findFirst();

        if (c.isPresent()) {
            this.conteudosConcluidos.add(c.get());
            this.conteudosInscritos.remove(c.get());
            System.out.println("Você concluiu o conteúdo: " + c.get().getTitulo());
        }else{
            System.out.println("Você já concluiu todos os conteúdos");
        }

        
    }

    public void printConteudosInscritos() {
        System.out.println("Conteúdos inscritos: ");
        for (Conteudo conteudo : conteudosInscritos) {
            System.out.println(conteudo);
        }
    }

    public void printConteudosConcluidos() {
        System.out.println("Conteúdos concluídos: ");
        for (Conteudo conteudo : conteudosConcluidos) {
            System.out.println(conteudo);
        }
    }

    public void calcularTotalXp(){
        double totalXp = this.conteudosConcluidos.stream()
                        .map(Conteudo::calcularXp)
                        .reduce(0d, Double::sum);
        System.out.println("Total XP: " + totalXp);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }



}
