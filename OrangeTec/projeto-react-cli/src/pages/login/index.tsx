import { useForm } from "react-hook-form";
import { useNavigate } from "react-router-dom";
import { yupResolver } from '@hookform/resolvers/yup';
import * as yup from 'yup';
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
import { IFormData } from "./types";

const schema = yup.object({
    email: yup.string().email('E-mail não é valido').required('Campo obrigatório'),
    password: yup.string().min(3, 'DIgite no minimo 3 caracteres').required('Campo obrigatório'),
}).required();

//implementando o react-hook-form

const Login = () => {
    const navigate = useNavigate()

    const { control, handleSubmit, formState: { errors } } = useForm<IFormData>({
        resolver: yupResolver(schema),
        mode: 'onChange',
    });

    const onSubmit = async (formData: IFormData) => {
        try {
            const { data } = await api.get(`users?email=${formData.email}&&users?password=${formData.password}`);
            console.log(data);
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
                            <Input name="email" errorMessage={errors?.email?.message} control={control} placeholder="E-mail" leftIcon={<MdEmail/>} />
                            {errors.email && <span>E-mail obrigatório</span>}
                            <Input name="password" errorMessage={errors?.password?.message} control={control} placeholder="Senha" leftIcon={<MdLock/>} />
                            {errors.password && <span>Senha obrigatória</span>}
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