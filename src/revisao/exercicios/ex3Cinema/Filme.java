package revisao.exercicios.ex3Cinema;

import java.time.LocalTime;

public class Filme {
    private String titulo;
    private int duracaoEmMinutos;
    private String horarioSessao;
    private Enum genero;

    public Filme(String titulo, int duracaoEmMinutos, String horarioSessao) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.horarioSessao = horarioSessao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public double calcularDuracaoEmHoras() {
        double minutos = this.duracaoEmMinutos - (this.duracaoEmMinutos % 60.00d);
        double horas = (this.duracaoEmMinutos - minutos) / 60;
        return minutos + minutos / 100;
    }

    public void retornarHoraQueAcaba() {
        LocalTime horarioSessao = LocalTime.parse(this.horarioSessao);
        LocalTime finalSessao = horarioSessao.plusMinutes(this.duracaoEmMinutos);
        System.out.println("O final da sessão é as: " + finalSessao);
    }
}