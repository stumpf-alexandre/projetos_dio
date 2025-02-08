const num = 0;
const numDivididoPor5 = (num % 5) === 0;

if (num === 0) {
    console.log('O número é invalido');
}else if (numDivididoPor5) {
    console.log('O número é divisível por 5');
}else {
    console.log('O número não é divisível por 5');
}