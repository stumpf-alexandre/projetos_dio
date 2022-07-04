//como era
var Meal = function(food){
    this.food = food;
}

Meal.prototype.eat = function(){
    return 'Estou satisfeito!';
}

//como é com o ECMAScript6
class Meal{
    constructor(food){
        this.food = food;
    }

    eat(){
        return 'Estou satisfeito!'; 
    }
}


//////////////////////////////////////
//Classe pai e classe filha com herança
class Animal{
//construtor
    constructor(type = 'animal'){
        this.type = type
    }
//getter
    get type(){
        return this._type
    }
//setter
    set type(val){
        this._type = val.toUpperCase()
    }

    makeSound(){
        console.log('Making animal sound')
    }
}

let a = new Animal()
console.log(a.type)//ANIMAL


class Cat extends Animal{
    constructor(){
//super utiliza o construtor da classe pai
        super('cat')
    }
//metodo
    makeSound(){
        super.makeSound()
        console.log('Meow!')
    }
}

let b = new Cat()
console.log(b.type)//CAT