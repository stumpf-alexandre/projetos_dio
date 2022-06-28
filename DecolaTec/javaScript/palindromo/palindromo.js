//solução 1

function verificarPalindromo(string){
    if(!string) return "String inexistente";

    return string.split("").reverse().join("") === string;
}

console.log(verificarPalindromo("ovo"));

console.log(verificarPalindromo("ama"));

let myVar = null;
console.log(verificarPalindromo("myVar"));

let myVar1 = false;
console.log(verificarPalindromo("myVar1"));

//solução 2

function verificarPalindromo2(string){
    if(!string) return "String inexistente";

    for(let i = 0; i < string.length / 2; i++){
        if (string[i] !== string[string.length - 1 - i]){
            return false;
        }
    }
    return true;
}

console.log(verificarPalindromo2("abba"));

console.log(verificarPalindromo2("gato"));

//no terminal bash, dentro da pasta do arquivo que deseja executar digite (node nome do arquuivo.js)