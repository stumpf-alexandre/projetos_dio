<?php
    $arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    $qtd = count($arr);

    for ($i=0; $i < $qtd; $i++) { 
        echo $arr[$i] . "\n";
    }

    //transformando o for em um foreach
    foreach($arr as $value){
        echo $value . "\n";
    }

    foreach($arr as $indice => $value){
        echo "Valor do índice : " . $indice . ", valor : " . $value . "\n";
    }

    foreach($arr as $indice => $value){
        if($value == 4){//para o loopin quando achar o valor exato
            break;
        }
        echo "Valor do índice : " . $indice . ", valor : " . $value . "\n";
    }

    foreach($arr as $indice => $value){
        if($value % 2 == 0){//continua o loopin quando achar o valor exato sem imprimir nada
            continue;
        }
        echo "Valor do índice : " . $indice . ", valor : " . $value . "\n";
    }
?>