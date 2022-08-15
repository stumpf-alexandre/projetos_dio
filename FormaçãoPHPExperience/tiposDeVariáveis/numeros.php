<?php
    $x = 40;
    $y = -90;
     //os valores armazenados podem ser do tipo inteiros negativos ou positivos

     echo "{$x}\n";
     echo "{$y}\n";

     //ou simplesmente usando o var_dump() ele mostra o numero e o tipo de numero que a variavel esta armazenando
     var_dump($x);
     var_dump($y);

     //calculos matemáticos
     $valorDia = 80;
     $gorjeta = 15;
     $combustivel = -30;

     $z = $valorDia + $gorjeta + $combustivel;

     var_dump($z);
?>