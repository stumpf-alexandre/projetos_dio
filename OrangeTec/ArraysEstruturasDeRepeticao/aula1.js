/*{} representa a criação de um objeto ou bloco de código
[] representa a criação de uma lista*/
const alunos = ['João', 'Vitor', 'Maria'];

console.log(alunos);
console.log(alunos[0]);
console.log(alunos[2]);

//adicionando na lista
alunos.push('Renan');
console.log(alunos);

alunos[4] = 'Vinicios';
console.log(alunos);

//excluir um da lista
alunos.pop(); //remove o ultimo da lista
console.log(alunos);

alunos.shift(); //remove o primeiro da lista
console.log(alunos);


//estruturas de repetição
const notas = [];

notas.push(5);
notas.push(7);
notas.push(8);
notas.push(2);
notas.push(5);
notas.push(8);

let soma = 0;
for (let i = 0; i < notas.length; i++) {
    const elemen = notas[i];
    soma = soma + elemen
}
const media = (soma / notas.length).toFixed(2);
console.log(media);


const nome = 'Alexandre Luis Stumpf'

for (let i = 0; i < nome.length; i++) {
    console.log(nome[i]);
}