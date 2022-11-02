/*Crie um programa que seja capaz de percorrer uma lista de números e imprimir cada número par encontrado*/
const numeros = [1, 3, 6, 3, 9, 10, 44, 69];
for (let i = 0; i < numeros.length; i++) {
    const n = numeros[i] % 2;
    if (n === 0) {
        console.log(`O número ${numeros[i]} é par`);
    }
}