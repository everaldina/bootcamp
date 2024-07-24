package bootcamp.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate inicio;
    private final LocalDate fim;
    private Set<Dev> devsInscritos;
    private Set<Conteudo> conteudos;


    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.inicio = LocalDate.now();
        this.fim = inicio.plusDays(45);
        this.conteudos = new LinkedHashSet<>();
        this.devsInscritos = new HashSet<>();
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    void inscreverDev(Dev dev){
        this.devsInscritos.add(dev);
    }


    public void printConteudos(){
        for (Conteudo conteudo : conteudos) {
            System.out.println(conteudo);
        }
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public LocalDate getInicio() {
        return inicio;
    }


    public LocalDate getFim() {
        return fim;
    }


    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }


    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }


    public Set<Conteudo> getConteudos() {
        return conteudos;
    }


    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    

}
