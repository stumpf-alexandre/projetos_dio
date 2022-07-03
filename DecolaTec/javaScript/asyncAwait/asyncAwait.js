async function resolvePromise() {
    const myPromises = new Promise((resolve, reject) => {
        window.setTimeout(() => {
            resolve('Resolvida');
        }, 3000);
    });

    const resolved = await myPromises
                .then((result) => result + 'passando pelo then')   
                .then((result) => result + 'e agora acabou!')
                .catch((err) => console.log(err.message));

    return resolved;
}
//sem o async e o await a função promise não sera executada pq no javascript as funções são sincronas


//utilizando try/catch com async/await e promises
async function resolvePromise(){
    const myPromise = new Promise((resolve, reject) => {
        window.setTimeout(() => {
            resolve('Resolvida');
        }, 4000);
    });

    let result;

    try {
        result = await myPromise
            .then((result) => result + 'passando pelo then')
            .then((result) => result + 'e agora acabou!')
    } catch (err) {
        result = err.message;        
    }
    return result;
}