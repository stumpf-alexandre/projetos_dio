function escreverNome(nome) {
    return "Olá, meu nome é " + nome + ", ";
}

function verIdade(idade) {
    if (idade >= 18) {
        console.log(escreverNome("Alexandre") + "eu sou maior de idade!");
    } else {
        console.log(escreverNome("Alexandre") + "eu sou menor de idade!");
    }
}

verIdade(19)