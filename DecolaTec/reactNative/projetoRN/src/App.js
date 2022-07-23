import React from 'react';
import {View, Image, StyleSheet, SafeAreaView, StatusBar, Text} from 'react-native';

const colorGithub = '#010409';
const colorFontGitHub = '#C9D1D9';
const colorDarkFontGitHub = '#4F565E';

const imageProfileGithub = 'https://avatars.githubusercontent.com/u/16006888?v=4'

const App = () => {
    return (
        //protege os componentes para não sairem para locais indevidos da tela
        <SafeAreaView style = {style.container}>
            {/*mostra o status de bateria, wifi, etc*/}
            <StatusBar backgroundColor = {colorGithub} barStyle = "light-content"/>

            <View style = {style.content}>
                {/*imagem vinda do avatar do git hub*/}
                <Image accessibilityLabel='Foto do Alexandre' style = {style.avatar} source={{uri: imageProfileGithub}} />

                {/*a tag style pode receber um array de estilos*/}
                <Text accessibilityLabel='Nome: Alexandre Stumpf' style = {[style.defaultText, style.name]}>Alexandre Stumpf</Text>
                <Text accessibilityLabel='Nickname: stumpf-alexandre' style = {[style.defaultText, style.nickname]}>stumpf-alexandre</Text>
                <Text accessibilityLabel='Descrição: Software Engineer | Data Science | Mobile Developer' style = {[style.defaultText, style.description]}>Software Engineer | Data Science | Mobile Developer</Text>
            </View>
        </SafeAreaView>
    );
};

export default App;

//criando um style para estilizar a view e o texto
const style = StyleSheet.create({
    container: {
        backgroundColor: colorGithub,
        flex: 1, //expande a view na tela inteira
        justifyContent: 'center',//centraliza a imagemView no meio da tela
        //flexDirection: 'row',//direciona os itens da tela para uma linha, ja que por padrão elas são disponibilizadas por colunas
    },
    //estado de conteudo da pagina
    content: {
        alignItems: 'center',//centraliza a imagemView no topo
        padding: 20,
    },
    //a imageView necessita de uma altura e largura, se não, não aparece na tela
    avatar: {
        height: 200,
        width: 200,
        borderRadius: 100,
        borderColor: 'white',
        borderWidth: 2,
    },
    defaultText: {
        color: colorFontGitHub,
    },
    name: {
        marginTop: 20,
        fontWeight: 'bold',
        fontSize: 24,
    },
    nickname:{
        fontSize: 18,
        color: colorDarkFontGitHub,
    },
    description: {
        fontWeight: 'bold',
        fontSize: 14,
    },
});