package bootcamp.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    
    
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }
    

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
}
