<?php
    require __DIR__ . '/../vendor/autoload.php';

    use Alsst\ContaBancaria;

    $conta = new ContaBancaria(
        'Banco Inter',       //  banco
        'Alexandre Stumpf',  //  nomeTitular
        '8244',              //  numeroAgencia
        '57354-10',          //  numeroConta
        0                    //  saldo
    );
    var_dump($conta -> obterSaldo());

    var_dump($conta -> depositar(2));

    var_dump($conta -> obterSaldo());

    var_dump($conta -> sacar(1));

    var_dump($conta -> obterSaldo());

    echo $conta -> obterSaldo();  //0
    echo PHP_EOL;

    echo $conta -> depositar(50);
    echo PHP_EOL;

    echo $conta -> obterSaldo();  //50
    echo PHP_EOL;

    echo $conta -> sacar(30);  //30
    echo PHP_EOL;

    echo $conta -> obterSaldo();  //20
    echo PHP_EOL;

    //comando na pasta raiz "composer dump-autoload"