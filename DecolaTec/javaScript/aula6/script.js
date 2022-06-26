//tipos de função

//declarativas
function funcao(){
    console.log('Mensagem de uma função declarativa');
}
funcao();

//expressão de função
//com nomeação
var fun = function fun(){
    console.log('Sou uma mensagem de função de expressão com nomeação!');
}
fun();

//sem nomeação
var fun1 = function() {
    console.log('Sou uma mensagem de função de expressão sem nomeação!');
}
fun1();

//arrow function
var fun2 = () => {
    console.log('Sou uma arrow function');
}
fun2();