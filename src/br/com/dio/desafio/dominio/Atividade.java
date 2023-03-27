package br.com.dio.desafio.dominio;

public class Atividade extends Conteudo {
    private int cargaHoraria;
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public Atividade() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
