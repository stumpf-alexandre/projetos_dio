function verIdade (idade) {
    if (idade >= 18) {
        return 'Maior de idade';
    } else {
        return 'Menor de idade';
    }
}

const idade = verIdade(17);
console.log(idade)