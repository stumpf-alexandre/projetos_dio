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