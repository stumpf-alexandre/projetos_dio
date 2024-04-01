<?php
    require __DIR__ . '/../vendor/autoload.php';

    use Alsst\ContasBancarias;

    $conta = new ContasBancarias();

    var_dump($conta->exibirDadosDaConta());

    //comando na pasta raiz "composer dump-autoload"