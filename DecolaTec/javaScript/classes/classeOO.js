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