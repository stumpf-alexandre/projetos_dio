const lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const somaDeTodosOsNumeros = lista.reduce((previous, current) => {
    return previous + current;
});

console.log(somaDeTodosOsNumeros); // 55    