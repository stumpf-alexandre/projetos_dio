<?php
    $array = [1, 5, 3, 0];
    $qtd = count($array);

    for ($i=0; $i < $qtd - 1; $i++) { 
        for ($j=0; $j < $qtd - $i - 1; $j++) { 
            $aux = $j + 1;
            if ($array[$aux] < $array[$j]) {
                $novo = $array[$j];
                $array[$j] = $array[$aux];
                $array[$aux] = $novo;
            }
        }
    }
    print_r($array) . "\n";
?>