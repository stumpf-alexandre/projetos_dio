<?php

    require __DIR__ . '/../vendor/autoload.php';

    use Alsst\ContasTipo\ContaPoupanca;

    $conta = new ContaPoupanca(
        'Banco do Brasil',
        'Alexandre Stumpf',
        '8244',
        '57354-10',
        0
    );

    echo $conta -> obterSaldo();
    echo PHP_EOL;

    echo $conta -> depositar(50);
    echo PHP_EOL;

    echo $conta -> obterSaldo();
    echo PHP_EOL;

    echo $conta -> sacar(30);
    echo PHP_EOL;

    echo $conta -> obterSaldo();
    echo PHP_EOL;

    //comando na pasta raiz "composer dump-autoload"