import { 
    useState, 
    useEffect, 
    useMemo,
} from 'react';

//useState é um hook utilizamos para lida com um estado dentro de um componente
//useEffect é um hook que vai trabalhar o ciclo de vida do meu componente, gerencia os efeitos dos componentes
//useMemo é um hook que memoriza alguma coisa quando meu componente renderiza, principalmente para performance do aplicativo que precisa fazer calculos

const Teste = () => {
    const [name, setName] = useState('Usuario');

    const handleChangeName = () => {
        //setName('Alexandre')
        //aqui podemos fazer uma validação
        setName(prev => prev === 'Usuario' ? 'Alexandre' : 'Usuario')
    }

    const calculo = useMemo(() => {
        alert('calculou')
        return 10 * 2934947
    }, []);

    console.log('renderizou', calculo);

    useEffect(() => {
        alert('renderizei');
        //implementando aqui voce faz com que o useEffect execute uma vez

        //podemos criar um return com função para quando o componente saia da tela ou arvore de componentes
        //return () => {alert('deslogado')}
    }, [
        name
        //implementando aqui voce faz com que o useEffect execute mais de uma vez
    ]);

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