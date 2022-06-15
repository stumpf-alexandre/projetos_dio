var currentNumberWrapper = document.getElementById("currentNumber");
var currentNumber = 0;

function mais(){
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
}

function menos(){
    currentNumber = currentNumber - 1;
    currentNumberWrapper.innerHTML = currentNumber;
}