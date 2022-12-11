import { useForm } from "react-hook-form";

import { useNavigate } from "react-router-dom";
import { MdEmail, MdLock } from 'react-icons/md';
import { Button } from '../../components/Button';
import { Header } from '../../components/Header';
import { Input } from '../../components/Input';
import { api } from '../../services/api'
import { 
    Column,
    Container, 
    CriarText, 
    EsqueciText, 
    Row, 
    SubTitleLogin, 
    Title, 
    TitleLogin, 
    Wrapper, 
} from './style';

//implementando o react-hook-form

const Login = () => {
    const navigate = useNavigate()

    const { control, handleSubmit, formState: { errors } } = useForm({
        reValidateMode: 'onChange',
        mode: 'onChange',
    });

    const onSubmit = async (formData) => {
        try {
            const { data } = await api.get(`/users?email=${formData.email}&senha=${formData.senha}`);

            if (data.length && data[0].id) {
                navigate('/feed')
                return      
            } else {
                alert('Email ou senha inválido.');
            }
        } catch {
            alert('Houve um erro, tente novamente.');
        }
    };

    return (
        <>
            <Header />
            <Container>
                <Column>
                    <Title>
                        A plataforma para você aprender com experts, dominar as principais tecnologias e entrar mais rápido nas empresas mais desejadas.
                    </Title>
                </Column>
                <Column>
                    <Wrapper>
                        <TitleLogin>Faça seu cadastro</TitleLogin>
                        <SubTitleLogin>Faça seu login e make the change._</SubTitleLogin>
                        <form onSubmit={handleSubmit(onSubmit)}>
                            <Input name="email" control={control} placeholder="E-mail" type="email" leftIcon={<MdEmail/>} />
                            {errors.email && <span>E-mail obrigatório</span>}
                            <Input name="senha" placeholder="Senha" type="password" leftIcon={<MdLock/>} />
                            {errors.senha && <span>Senha obrigatória</span>}
                            <Button title="Entrar" variant="secondary" type="submit"/>
                        </form>
                        <Row>
                            <EsqueciText>Esqueci minha senha</EsqueciText>
                            <CriarText>Criar Conta</CriarText>
                        </Row>
                    </Wrapper>
                </Column>
            </Container>
        </>
    )
}

export { Login }