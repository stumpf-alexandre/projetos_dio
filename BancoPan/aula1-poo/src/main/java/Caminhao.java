public class Caminhao extends Veiculo {
    // atributo
    String montadora;
    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor
    public Caminhao() {
    }

    public Caminhao(String montadora, String cor, String modelo, int capacidadeTanque) {
        this.montadora = montadora;
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // get e set
    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
