import { 
    useState, 
    useEffect, 
    useMemo,
    useCallback,
} from 'react';

//useState é um hook utilizamos para lida com um estado dentro de um componente
//useEffect é um hook que vai trabalhar o ciclo de vida do meu componente, gerencia os efeitos dos componentes
//useMemo é um hook que memoriza alguma coisa quando meu componente renderiza, principalmente para performance do aplicativo que precisa fazer calculos
//useCallback é um hook muito parecido com o useMemo, mas ele armazena uma função ao invez de um calculo

const Teste = () => {
    const [name, setName] = useState('Usuario');
    const [age, setAge] = useState(34);

    //const handleChangeName = () => {
        //setName('Alexandre')
        //aqui podemos fazer uma validação
        //setName(prev => prev === 'Usuario' ? 'Alexandre' : 'Usuario')
    //}

    const handleChangeName = useCallback(() => {
        setName(prev => prev === 'Usuario' ? 'Alexandre' : 'Usuario');
    },[])

    const handleChangeAge = useCallback(() => {
        const newAge = 10 * age;
        console.log('Idade atual', age, newAge)
        setAge(prev => prev === 34 ? 43 : 34)
    },[])//sem arrey de dependencia
      //[age] com arrey de dependencia

    //const calculo = useMemo(() => {
        //alert('calculou')
        //return 10 * 2934947
    //}, []);

    //console.log('renderizou', calculo);

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
                Nome: {name}
            </p>
            <br/>
            <p>
                Idade: {age}
            </p>
            <br/>
            <button onClick={handleChangeName}>Alterar nome</button>
            <br/>
            <button onClick={handleChangeAge}>Alterar idade</button>
        </div>
    )
}

export { Teste };