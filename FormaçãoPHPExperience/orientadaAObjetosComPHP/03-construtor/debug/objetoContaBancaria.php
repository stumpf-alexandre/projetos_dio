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

    var_dump($conta -> getBanco());
    var_dump($conta -> getNomeTitular());
    var_dump($conta -> exibirDadosDaConta());

    //comando na pasta raiz "composer dump-autoload"