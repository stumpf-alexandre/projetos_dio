function gets() {
    return 10;
}

function print(texto) {
    console.log(texto);
}

module.exports = {gets,print}; //exportando um objeto que tenha uma função get e print

/*ou pode ser
module.exports.gets = gets;
module.exports.print = print;

ai não usaria a parte de cima*/