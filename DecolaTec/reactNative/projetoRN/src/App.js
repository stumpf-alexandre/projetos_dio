import React from 'react';
import {View, Image, StyleSheet, SafeAreaView, StatusBar, Text, Pressable, Linking} from 'react-native';

const colorGithub = '#010409';
const colorFontGitHub = '#C9D1D9';
const colorDarkFontGitHub = '#4F565E';

const imageProfileGithub = 'https://avatars.githubusercontent.com/u/16006888?v=4';

const urlToMyGitHub = 'https://github.com/stumpf-alexandre';

const App = () => {
    //criando função de botão para acessar github
    //o Linking tem uma função para abrir uma url
    const handlePressGoToGithub = async () => {
        const res = await Linking.canOpenURL(urlToMyGitHub);
        if(res){
            await Linking.canOpenURL(urlToMyGitHub);
        }
    };
    //colocar uma verificação parapermitir abrir um link, para isso deve ir na pasta do android, app, src, main, androidManifest e em acima de aplication acressentar <queries>, <intent>, <action android:name="android.intent.action.VIEW"/>, <category android:nome="android.intent.category.BROWSABLE"/> e <data android:scheme="https"/>

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

            {/*o pressable serve para tornar clickavel o botão*/}
            <Pressable onPress = {handlePressGoToGithub}>
                <View style = {style.button}>
                    <Text style = {[style.defaultText, style.textButton]}>Open in Github</Text>
                </View>
            </Pressable>
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
    nickname: {
        fontSize: 18,
        color: colorDarkFontGitHub,
    },
    description: {
        fontWeight: 'bold',
        fontSize: 14,
    },
    button: {
        marginTop: 20,
        backgroundColor: colorDarkFontGitHub,
        borderRadius: 10,
        padding: 20,
    },
    textButton: {
        fontWeight: 'bold',
        fontSize: 16,
    },
});