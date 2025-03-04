const lista = [{nome: 'João'}, {nome: 'Maria'}, {nome: 'José'}, {nome: 'Pedro'}, {nome: 'Amanda'}, {nome: 'Alexandre'}];

console.log(
    lista.map(e => e.nome)
        .filter((e) => e.startsWith('J'))
        .join('; ')
);

const elementosEmHtml = lista
    .filter((e) => e.nome.startsWith('A'))
    .map(e => `<li>${e.nome}</li>`)
    .join('')

console.log(elementosEmHtml); // <li>Amanda</li><li>Alexandre</li>