function esteEMeuNome(nome) {
    console.log("Meu nome é " + nome);
}

esteEMeuNome("Lucas");
esteEMeuNome("João");
esteEMeuNome("Maria");

function quadrado(valor) {
    return valor * valor;
}

const quadradoDeDez = quadrado(10);
console.log(quadradoDeDez);

console.log(quadrado(5) + quadrado(3));

function incrementarJuros(valor, percentualJuros) {
    const valorDeAcrecimo = (percentualJuros / 100) * valor;
    return valor + valorDeAcrecimo;
}

console.log(incrementarJuros(100, 10));
console.log(incrementarJuros(100, 15));