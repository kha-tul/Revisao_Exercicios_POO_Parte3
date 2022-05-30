package revisao.exercicios.ex4AbastecerVeiculo;
/*
Criar uma classe veículo conforme UML abaixo: A classe veículo não pode ter a quantidade de combustível
no tanque no construtor, deve ser sempre instanciado com 0 litros. Cada vez que for abastecido e
passada uma quantidade de litros deve ser avaliado se excede ou não e demonstrado no console a
nova quantidade de litros no tanque e em caso de excesso, abastecer somente dentro da capacidade
e informar os litros excedentes. Imprimir também o valor gasto para abastecer, considerando que
o livro do combustível custa R$7,00.
 */


public class Main extends Veiculo {
    public Main(String nome, String marca, int capacidadeDoTanque, int litrosNoTanque) {
        super(nome, marca, capacidadeDoTanque, litrosNoTanque);
    }

    public Main(String gol, String volkswagem, int i) {
        super(gol, volkswagem, i);
    }

    public void main(String[] args) {
        Veiculo veiculo = new Veiculo("Gol", "Volkswagem", 60);

        veiculo.abastecer(5);
        veiculo.abastecer(30);
        veiculo.abastecer(60);
    }

}



