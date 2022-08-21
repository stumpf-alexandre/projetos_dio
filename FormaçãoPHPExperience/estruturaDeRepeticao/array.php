<?php
    $array = array(
        "Chave" => "valor",
    );

    //a partir do PHP 5.4
    $array = [
        "Chave" => "valor",
    ];

    $carro = ['Ferrari', 'BMW', 'Mercedes'];
    print_r($carro);

    $carro = ['Ferrari', 'BMW', 'Mercedes'];
    print_r($carro[2]);

    $endereco = [//foi adicionado uma chave para cada valor do array podendo assim acessar pela chave
        //array associativo
        'cep' => "1213141516",
        'numero' => "12345",
        "cidade" => "Torres",
        "estado" => "Rio Grande do Sul"
    ];
    print_r($endereco);

    $endereco = [
        //array associativo
        'cep' => "1213141516",
        'numero' => "12345",
        "cidade" => "Torres",
        "estado" => "Rio Grande do Sul"
    ];
    print_r($endereco['cidade']);

    $enderecoPessoa = [
        'pessoa1' => array(
            "cep" => "12345668673",
            "cidade" => "Salvador"
        ),
        'pessoa2' => [
            "cep" => "969587489495",
            "cidade" => "Minas Gerais"
        ],
    ];
    print_r($enderecoPessoa);
    //ver os dados da pessoa1
    print_r($enderecoPessoa['pessoa1']);
    //ver apenas o cep da pessoa2
    print_r($enderecoPessoa['pessoa2']['cep']);

    if ($enderecoPessoa['pessoa2']['cidade']) {
        //criando uma condicional para ver se existe os dados
        print_r($enderecoPessoa['pessoa2']['cidade']);
    }else{
        echo "Chave invalida!";
    }
?>