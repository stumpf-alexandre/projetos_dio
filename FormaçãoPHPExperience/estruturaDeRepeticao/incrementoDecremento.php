<?php
    echo "Pré-decremento\n";
    $a = null;
    //o decremento no valor de null não gera valor, mas no incremento gera
    echo "Deve ser : " . --$a . "\n";
    echo "É : " . $a . "\n";
    echo "Deve ser : " . ++$a . "\n";
    echo "É : " . $a . "\n";

    echo "Pré-decremento\n";
    $a = 0;
    echo "Deve ser : " . --$a . "\n";
    echo "É : " . $a . "\n";

    echo "Pós-decremento\n";
    $a = 0;
    echo "Deve ser : " . $a-- . "\n";
    echo "É : " . $a . "\n";

    echo "Pré-incremento\n";
    $a = 0;
    echo "Deve ser : " . ++$a . "\n";
    echo "É : " . $a . "\n";

    echo "Pós-incremento\n";
    $a = 0;
    echo "Deve ser : " . $a++ . "\n";
    echo "É : " . $a . "\n";
?>