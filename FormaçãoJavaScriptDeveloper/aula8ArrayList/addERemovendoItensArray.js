const alunos = ['João', 'Maria', 'José'];
//ADD
alunos.push('Alexandre');

console.log(alunos);
//Edita
alunos[2] = 'Roberto';

console.log(alunos);
//Exclui ultimo item
alunos.pop();

console.log(alunos);
//Exclui primeiro item
alunos.shift();

console.log(alunos);
console.log(alunos[0]);
console.log(alunos[1]);
console.log(alunos[2]);