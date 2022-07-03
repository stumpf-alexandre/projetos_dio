const myPromises = new Promise((resolve, reject){
    window.setTimeout(() => {
        resolve(console.log('Resolvida'));
    }, 2000);
});