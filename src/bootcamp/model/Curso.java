package bootcamp.model;

public class Curso extends Conteudo {
    private int cargaHoraria;


    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }


    public double calcularXp() {
        return XP_PADRAO + (5 * cargaHoraria);
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
}
