<?php
    $frutas = ["banana", "maça", "pera", "uva"];
    $cont = count($frutas);
    $i = 0;

    while ($i < $cont) {
        echo $frutas[$i] . "\n";
        $i++;
    }

    $i = 0;

    while ($i < $cont) {
        if ($frutas[$i] == 'pera') {
            break;
        }
        echo $frutas[$i] . "\n";
        $i++;
    }

    $i = 0;

    do {
        if ($frutas[$i] == 'pera') {
            break;
        }
        echo $frutas[$i] . "\n";
        $i++;
    } while ($i < $cont);

?>