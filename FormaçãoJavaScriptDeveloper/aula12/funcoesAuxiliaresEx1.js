const entradas = [10, 5, 50, 10, 98, 23, 33, 44, 99, 1, 7];
let i = 0;

function gets(){
    const valor = entradas[i];
    i++;
    return valor;
}

function print(texto){
    console.log(texto);
}

//exporta para ser importado
module.exports = {gets, print}; 