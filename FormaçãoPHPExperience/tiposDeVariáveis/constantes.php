<?php
    //entregador de deliveri ganha 80 reais por dia porém ainda tem as gorjetas dos clientes

    define("valorDiaria", "80");// criando uma constante
    $gorjetas = 40;//criando uma variavel
    $diaria = valorDiaria + $gorjetas;
    echo "Diaria de segunda feira = $diaria\n";

    $gorjetas = 15;//criando uma variavel
    $diaria = valorDiaria + $gorjetas;
    echo "Diaria de terça feira = $diaria\n";
    // no caso das constantes em caso de troca ira dar um erro pq o php não aceita modificar uma constante
?>