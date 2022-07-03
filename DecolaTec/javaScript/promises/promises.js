const myPromises = new Promise((resolve, reject){
    window.setTimeout(() => {
        resolve(console.log('Resolvida'));
    }, 2000);
    //apos 2 segundos , retornara o valor
});

await myPromises
        .then((result) => result + 'passando pelo then')
        .then((result) => result + 'e agora acabou!')
        .catch((err) => console.log(err.message));
//resolvida passando pelo then e agora acabou!