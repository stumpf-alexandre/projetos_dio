//Faça um algoritmo que dado as 3 notas tiradas por um aluno em um semestre da faculdadecalcule e imprima sua média e a sua classificação conforme a tabela abaixo.

//Média = (nota1 + nota2 + nota3) / 3

//Classificação:
//- Média menor que 5, reprovado;
//- Média entre 5 e 7, recuperação;
//- Média maior que 7, passou de semestre;

var readline = require('readline-sync');

let nota1 = parseFloat(readline.question('Qual a 1° nota? '));

let nota2 = parseFloat(readline.question('Qual a 2° nota? '));

let nota3 = parseFloat(readline.question('Qual a 3° nota? '));

let media = parseFloat(nota1 + nota2 + nota3) / 3;

if (media < 5) {
    console.log(`Reprovado com média ${media.toFixed(2)}`);
} else if (media >= 5 && media < 7) {
    console.log(`Recuperação com média ${media.toFixed(2)}`);
} else {
    console.log(`Aprovado com média ${media.toFixed(2)}`);
}