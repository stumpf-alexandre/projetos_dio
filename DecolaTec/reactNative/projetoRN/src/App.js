import React from 'react';
import {View, Text, StyleSheet, SafeAreaView, StatusBar} from 'react-native';

const App = () => {
    return (
        //protege os componentes para não sairem para locais indevidos da tela
        <SafeAreaView>
            <StatusBar backgroundColor = {'pink'} barStyle = "dark-content"/>

            <View style = {style.container}>
                <Text style = {style.text}>Ola mundo!!!!</Text>
            </View>
        </SafeAreaView>
    );
};

export default App;

//criando um style para estilizar a view e o texto
const style = StyleSheet.create({
    container: {
        backgroundColor: 'pink',
        flex: 1, //expande a view na tela inteira
    },
    text: {
        fontSize: 50,
        fontWeight: 'bold',
        color: 'black',
    },
});