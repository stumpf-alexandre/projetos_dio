const lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

lista.filter((value, i, listRef) => {
    console.log(value, i, listRef);
});

const listaDeNumerosPares = lista.filter((value) => {
    return value % 2 === 0;
});

console.log(listaDeNumerosPares);