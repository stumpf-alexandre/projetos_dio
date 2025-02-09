/*
1 - Crie uma classe para representar carros.
Os carros possuem uma marca, uma cor e um gasto médio de combustivel por Kilometro rodado.
Crie um método que dado a quantidade de quilometros e o preço do combustivel nos dê o valor gasto em reais para realizar este percurso.
*/

class Carro {
    marca;
    cor;
    consumoPorKm;

    //Construtor
    constructor(marca, cor, consumoPorKm) {
        this.marca = marca;
        this.cor = cor;
        this.consumoPorKm = consumoPorKm;
    }

    //Método
    valorGasto(km, preco) {
        return km * this.consumoPorKm * preco;
    }
}

const carro1 = new Carro('Fiat', 'Preto', 1 / 15);
console.log(`${carro1.valorGasto(100, 6.00).toFixed(2)} R$ gasto em combustivel com o ${carro1.marca}, que faz uma média de consumo de combustivel de ${carro1.consumoMedio} Km/l.`);

const carro2 = new Carro('Ford', 'Azul', 1 / 10);
console.log(`${carro2.valorGasto(100, 6.00).toFixed(2)} R$ gasto em combustivel com o ${carro2.marca}, que faz uma média de consumo de combustivel de ${carro2.consumoMedio} Km/l.`);