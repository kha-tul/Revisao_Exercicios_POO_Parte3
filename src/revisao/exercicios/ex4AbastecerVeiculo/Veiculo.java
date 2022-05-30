package revisao.exercicios.ex4AbastecerVeiculo;

import java.text.NumberFormat;

public class Veiculo<nome> {

    private String nome;
    private String marca;
    private int capacidadeDoTanque;
    private int litrosNoTanque;

    public Veiculo(String nome, String marca, int capacidadeDoTanque, int litrosNoTanque) {
        this.nome = nome;
        this.marca = marca;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.litrosNoTanque = litrosNoTanque;
    }

    public Veiculo(String gol, String volkswagem, int i) {
    }


        public void abastecer(int litros){
            NumberFormat formatter = NumberFormat.getCurrencyInstance();

            System.out.println("-------------------");

            if (litros > this.capacidadeDoTanque - this.litrosNoTanque) {
                int litrosAbastecidos = this.capacidadeDoTanque - this.litrosNoTanque;
                this.litrosNoTanque += litrosAbastecidos;
                System.out.println("Quantidade de litros no tanque: " + this.litrosNoTanque);
                int litrosExcedentes = litros - litrosAbastecidos;
                System.out.println("Litros excedentes: " + litrosExcedentes);
            } else {
                this.litrosNoTanque += litros;
                System.out.println("Quantidade de litros no tanque: " + this.litrosNoTanque);
            }

            System.out.println("Valor gasto para abastecer: " + formatter.format(litros * 7L));
        }

}
