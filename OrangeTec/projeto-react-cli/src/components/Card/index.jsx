import React from 'react';
import { FiThumbsUp } from 'react-icons/fi';
import {
    CardContainer,
    Content,
    HasInfo,
    ImageBackground,
    PostInfo,
    UserInfo,
    UserPicture
} from './style';
const Card = () => {
  return (
    <CardContainer>
        <ImageBackground />
        <Content>
            <UserInfo>
                <UserPicture src="https://avatars.githubusercontent.com/u/16006888?s=400&u=58c69be463a60a18afcc191909bb162c2605de3b&v=4"/>
                <div>
                    <h4>Alexandre Stumpf</h4>
                    <p>Há 8 minutos</p>
                </div>
            </UserInfo>
            <PostInfo>
                <h4>Projeto para curso de HTML e CSS</h4>
                <p>Projeto feito o curso de html e css no bootcamp dio do Global avanade...<strong>Saiba Mais</strong></p>
            </PostInfo>
            <HasInfo>
                <h4>#HTML #CSS #Javascript</h4>
                <p>
                    <FiThumbsUp /> 10
                </p>
            </HasInfo>
        </Content>
    </CardContainer>
  )
}

export { Card }