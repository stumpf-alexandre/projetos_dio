import { useState } from 'react';

//useState é um hook utilizamos para lida com um estado dentro de um componente

const Teste = () => {
    const [name, setName] = useState('Usuario');

    const handleChangeName = () => {
        //setName('Alexandre')
        //aqui podemos fazer uma validação
        setName(prev => prev === 'Usuario' ? 'Alexandre' : 'Usuario')
    }
    return(
        <div>
            <p>
                {name}
            </p>
            <button onClick={handleChangeName}>Alterar</button>
        </div>
    )
}

export { Teste };