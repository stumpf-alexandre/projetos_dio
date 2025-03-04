class Pessoa {
    constructor(nome) {
        this.nome = nome;
    }
}

const lista = [new Pessoa('Renan'), new Pessoa('Andressa'), new Pessoa('Vitor'), new Pessoa('José')];

const listaNomes = lista.map((element, i) => {
    return `${i} - ${element.nome}`;
});

console.log(listaNomes); // [ '0 - Renan', '1 - Andressa', '2 - Vitor', '3 - José' ]

const listaEmHtml = lista.map((element) => {
    return `
        <li>
            ${element.nome}
        </li>    
    `
});

console.log(listaEmHtml);