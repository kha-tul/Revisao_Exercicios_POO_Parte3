package revisao.exercicios.ex3Cinema;
/*
Criar classes conforme o UML abaixo: Criar uma classe main para demonstrar todos os métodos criados,
incluindo os objetos instanciandos. Método remover filme deve pedir a confirmação no console de que

deseja mesmo remover da lista de filmes em cartaz, validar entrada com caracteres ‘S’ para sim e ‘N’
 para não na resposta. Método adicionar filme deve logo em seguida da adição imprimir a lista de filmes
 em cartaz. Método calcular duracao em horas deve arredondar a resposta em horas e minutos sem casas decimais.
  Método que retorna a hora de finalização do filme deve comparar a quantidade de minutos e somar ao horário
   da sessão.
 */

public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme("Harry Poter", 120, "12:30");
        Filme filme2 = new Filme("Animais fantasticos", 130, "14:30");
        Cinema cinema = new Cinema("CinePoter", "Rua da Grifinoria");

        //adicionando filmes
        cinema.adicionarFilme(filme1);
        cinema.adicionarFilme(filme2);

        //removendo filme
        cinema.removerFilme(filme1);

        //
        filme1.calcularDuracaoEmHoras();
        filme1.retornarHoraQueAcaba();

    }
}
