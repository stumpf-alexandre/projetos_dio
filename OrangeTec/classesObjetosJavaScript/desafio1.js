/*1 - Crie uma classe para representar carros.
Os carros possuem uma marca, uma cor e um gasto médio de combustivel por Km rodado.
Crie um método que dado a quantidade de Km e o preço do combustivel nos de o valor gasto em reais para realizar este percurso.*/
class Carro {
    marca;
    cor;
    mediaConsumo;

    constructor (marca, cor, mediaConsumo) {
        this.marca = marca;
        this.cor = cor;
        this.mediaConsumo = mediaConsumo;
    }

    calcularGastoPercurso(distancia, precoCombustivel){
        return distancia * this.mediaConsumo * precoCombustivel;
    }
}
const uno = new Carro('Fiat', 'prata', 1 / 12);
const palio = new Carro('Fiat', 'branco', 1 / 10);

console.log(uno);
console.log(palio);

console.log(uno.calcularGastoPercurso(70, 5));
console.log(palio.calcularGastoPercurso(70, 5));