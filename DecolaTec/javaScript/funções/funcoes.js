//extrutura da funções
function nome(parametros){
    //instruções
    return; //valor de retorno
    //quando invocado o return a função para de ser executada
}

//função anonima
const soma = function(a, b){
    return a + b;
}
console.log(soma(1, 2)); //3
console.log(soma(5, 4)); //9


//função auto invocavel
(
    function(){
        let name = "DIO";
        return name;
    }
)();

//função auto invocavel com parametros
(
    function(a, b){
        return a + b;
    }
)(1, 2);
//3

const soma3 = (
    function(){
        return a + b;
    }
)(1, 2);

console.log(soma3);

//callbacks (uma função passada como argumento para outra)
//maior controle da ordem de chamada
const calc = function(operacao, num1, num2){
    return operacao(num1, num2);
}

const soma1 = function(num1, num2){
    return num1 + num2;
}

const sub = function(num1, num2){
    return num1 - num2;
}

const resultSoma = calc(soma, 1, 2);
const resultSub = calc(sub, 1, 2);

console.log(resultSoma);
console.log(resultSub);