public class Carro { // exercicio para criar a classe carro
    // atributos responsavel por definir as estruturas de dados da classe
    // métodos sub-rotinas disponibilizadas pela classe
    // objeto é a representação de um conceito/entidade do mundo real

    // atributos da classe carro
    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor
    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // get e set
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

    // metodo para encher o tanque
    double totalValorTanque(double valorComburtivel) {
        return capacidadeTanque * valorComburtivel;
    }
}
