<?php
    function divisao($dividendo, $divisor) {
        try{
            if ($divisor == 0) {
                throw new RangeException("O número não pode ser dividido por zero\n");
            }

            $resultado = $dividendo / $divisor;

            echo "O resultado é: " . $resultado . "\n";
        }catch(Exception) {
            echo "O número não pode ser dividido por zero\n";
        }finally{
            echo "Tratando exceções\n";
        }
    }

    divisao(10, 5);

    divisao(10, 0);
?>