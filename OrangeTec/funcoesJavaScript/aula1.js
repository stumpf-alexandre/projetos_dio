function teste() {
    console.log('teste');
}

teste();
teste();


function sayMyName(name) {
    console.log(name);
}

sayMyName('Ana');
sayMyName('Lara');


function quadrado(valor) {
    return valor * valor;
}

const quadradoDeDez = quadrado(10);
console.log(quadradoDeDez);

console.log(quadrado(10) + quadrado(10));


function incrementarJuros(valor, porcentagemJuros) {
    const valorDeAcrecimo = (porcentagemJuros / 100) * valor;
    return valor + valorDeAcrecimo;
}

console.log(incrementarJuros(100, 10));
console.log(incrementarJuros(100, 15));
console.log(incrementarJuros(100, 20));


function main () {
    console.log(incrementarJuros(300,55));
}

main = function () { /*reatribuindo nova função para o main*/
    console.log(1);
}
main();


/*função imediatamente invocada*/
(function () {
    console.log(incrementarJuros(355,75));
})();
