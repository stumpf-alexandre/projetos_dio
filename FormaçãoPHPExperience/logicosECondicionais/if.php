<?php
    $variavel1 = true;
    $variavel2 = true;
    $variavel3 = true;

    if($variavel1 == $variavel2){
        echo "Variaveis são iguais\n";
    }

    if($variavel1 == $variavel2 && 10 < 5){
        echo "Variaveis são iguais e 10 é menor do que cinco\n";
    }

    if($variavel1 == $variavel2 && 10 > 5){
        echo "Variaveis são iguais e 10 é maior do que cinco\n";
    }

    $variavel2 = false;

    if ($variavel1 == $variavel2) {
        echo "Variaveis são iguais\n";
    }

    if ($variavel1 != $variavel2) {
        //aninhando um if dentro de outro
        echo "Primeiro if\n";
        if(4 == 4){
            echo "Segundo if\n";
            if(8 == 2){
                echo "Terceiro if\n";
            }
        }
    }
?>