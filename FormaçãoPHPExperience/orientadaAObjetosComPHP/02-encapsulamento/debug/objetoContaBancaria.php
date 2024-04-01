<?php
    require __DIR__ . '/../vendor/autoload.php';

    use Alsst\ContaBancaria;

    $conta = new ContaBancaria();

    $conta -> setBanco("Banco Inter");
    $conta -> setNomeTitular("Alexandre Stumpf");
    $conta -> setNumeroAgencia("8244");
    $conta -> setNumeroConta("57354-10");
    $conta -> setSaldo(0);

    var_dump($conta -> getBanco());
    var_dump($conta -> getNomeTitular());
    var_dump($conta -> exibirDadosDaConta());

    //comando na pasta raiz "composer dump-autoload"