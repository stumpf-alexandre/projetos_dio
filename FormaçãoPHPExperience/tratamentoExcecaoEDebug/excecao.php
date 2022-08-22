<?php
    function f1() {
        echo ">F1 está antes da exceção\n";
    }

    function f2($int) {
        if (!is_int($int)) {
            throw new Exception("O argumento não é do tipo esperado\n");
        }else{
            echo ">F2 está na exceção\n";
        }

        f3();
    }

    function f3() {
        echo ">F3 está depois da exceção\n";
    }

    f1();
    f2(
        int: 5//.5
    );
?>