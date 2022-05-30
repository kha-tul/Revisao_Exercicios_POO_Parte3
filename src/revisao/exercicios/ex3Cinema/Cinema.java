package revisao.exercicios.ex3Cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
    private String nome;
    private String endereco;
    private List<Filme> filmesEmCartaz;

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.filmesEmCartaz = new ArrayList<Filme>();
    }

    public void adicionarFilme(Filme filme) {

        filmesEmCartaz.add(filme);

        listarFilmes();
    }

    public void removerFilme(Filme filme) {
        Scanner entrada = new Scanner(System.in);
        String confirmacao;
        System.out.println("Tem certeza que deseja remover este filme? ");
        confirmacao = entrada.next();

        if (confirmacao.equalsIgnoreCase("S")) {
            filmesEmCartaz.remove(filme);
            System.out.println("Filme removido da List");
        } else if (confirmacao.equalsIgnoreCase("N")) {
            System.out.println("Remoção do filme cancelada");
        } else {
            System.out.println("Resposta invalida");
        }

    }

    public void listarFilmes() {
        for (Filme filmeEmCartaz : this.filmesEmCartaz) {
            System.out.println(filmeEmCartaz.getTitulo());
        }
    }

}
