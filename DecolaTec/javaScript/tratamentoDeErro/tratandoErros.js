//criar função que receba array e um numero

function validaArray(arr, num){
    try {
        //verifica se os parametros não foram enviados
        if(!arr && !num) throw new ReferenceError("Envie os parâmetros exigidos");

        //verifica se o array não é do tipo objeto
        if(typeof arr !== 'object') throw new TypeError("O array precisa ser do tipo object");

        //verifica se o numero não é do tipo number
        if(typeof num !== 'number') throw new TypeError("O numero precisa ser do tipo number");

        //verifica se o tamanho do array é diferente do numero enviado
        if(arr.length !== num) throw new RangeError("Tamanho do array inválido!");

        return arr;
    } catch (e) {
        if(e instanceof ReferenceError){
            console.log("Este erro é um ReferenceError!");
            console.log(e.message);
        }else if(e instanceof TypeError){
            console.log("Este erro é um TypeError!");
            console.log(e.message);
        }else if(e instanceof RangeError){
            console.log("Este erro é um RangeError!");
            console.log(e.message);
        }else{
            console.log("Tipo de erro não esperado: " + e);
        }
    }
}

//enviando como parametro um array e o seu tamanho, para averiguar possiveis erros

//não enviando nem um parametro
console.log(validaArray());

//não enviando um array valido
console.log(validaArray(5, 5));

//não enviando um numero valido
console.log(validaArray([], 'a'));

//não enviando a quantidade de numero dentro do array igual ao numero do parametro
console.log(validaArray([1, 2], 5));

//numero de array e numero do parametro conferem
console.log(validaArray([1, 2, 3, 4, 5], 5));