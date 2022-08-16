<?php
//variavel global
    $a = 50;
    function subtracao(){
        global $a;
        $y = $a - 30;
        return $y;
    }
    echo subtracao(), "\n";

//variavel local
    function soma(){
        $x = 10 + 40;
        return $x;
    }
    //echo $x;
    echo soma(), "\n";
?>