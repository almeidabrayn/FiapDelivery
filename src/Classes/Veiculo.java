package Classes;

public class Veiculo {

    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;

        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa.");
        }

        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidade() {
        return capacidade;
    }
}