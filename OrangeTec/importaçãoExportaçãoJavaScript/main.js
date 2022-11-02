const funcoes = require('./funcoes-auxiliares'); //importando um objeto que tem a função get e print
console.log(funcoes.gets());

//ou

const {gets, print} = require('./funcoes-auxiliares');//conceito de destructuring
print(gets()); //funciona igual