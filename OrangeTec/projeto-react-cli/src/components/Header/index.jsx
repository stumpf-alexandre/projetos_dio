import React from 'react';
import logo from '../../assets/logo-dio.png';
import { Button } from '../Button';
import { 
    BuscarInputContainer, 
    Container, 
    Input, 
    Menu, 
    MenuRight, 
    Row, 
    UserPicture, 
    Wrapper, 
} from './style';

const Header = ({autenticado}) => {
    return (
        <Wrapper>
            <Container>
                <Row>
                    <img src={logo} alt="Logo da dio"/>
                    {autenticado ? (
                        <>
                            <BuscarInputContainer>
                                <Input placeholder="Buscar..."/>
                            </BuscarInputContainer>
                            <Menu>Live Code</Menu>
                            <Menu>Global</Menu>
                        </>
                    ) : null}
                </Row>
                <Row>
                    {autenticado ? (
                        <UserPicture src="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4"/>
                    ) : (
                        <>
                            <MenuRight href="/home">Home</MenuRight>
                            <Button title="Entrar"/>
                            <Button title="Cadastrar"/>
                        </>
                    )}
                </Row>
            </Container>
        </Wrapper>
    )
}

export { Header }