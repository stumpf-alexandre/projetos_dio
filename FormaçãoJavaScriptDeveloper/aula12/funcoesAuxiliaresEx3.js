const entradas = [5, 3, 4, 1, 10, 8];
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