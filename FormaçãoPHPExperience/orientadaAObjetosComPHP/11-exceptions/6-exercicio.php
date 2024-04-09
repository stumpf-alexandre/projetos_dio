<?php

    //código com exception e try catch e finally
    function divisao($num1, $num2){
        if($num1 === 0 || $num2 === 0){
            throw new Exception("Um dos números não é valido \n");
        }
        $resultado = $num1 / $num2;
        echo "Valor da divisão: " . $resultado . "\n";
    }

    

    try {
        divisao(0, 2);
        $status = true;
    } catch (Exception $e) {
        echo $e -> getMessage();
        $status = false;
    } finally {
        echo "Status da Operação: " . (int)$status; //cast
        die();
    }

    echo "\n... executando ...\n";