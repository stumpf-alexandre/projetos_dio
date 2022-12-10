import { Card } from '../../components/Card';
import { UserInfo } from '../../components/UserInfo';
import { Header } from '../../components/Header';
import { Container, Column, Title, TitleHighlight } from './style';

const Feed = () => {
    return (
        <>
            <Header autenticado={true} />
            <Container>
                <Column flex={3}>
                    <Title>Feed</Title>
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                    <Card />
                </Column>
                <Column flex={1}>
                    <TitleHighlight># RANKING 5 TOP DA SEMANA</TitleHighlight>
                    <UserInfo percentual={94} nome="Alexandre Stumpf" image="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4" />
                    <UserInfo percentual={80} nome="Alexandre Stumpf" image="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4" />
                    <UserInfo percentual={54} nome="Alexandre Stumpf" image="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4" />
                    <UserInfo percentual={32} nome="Alexandre Stumpf" image="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4" />
                    <UserInfo percentual={18} nome="Alexandre Stumpf" image="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4" />
                </Column>
            </Container>
        </>
    )
}

export { Feed }