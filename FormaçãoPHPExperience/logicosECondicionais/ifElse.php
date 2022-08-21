<?php
    $nota = 7;

    if($nota >= 7){
        echo "Aluno(a) aprovado !\n";
    }else{
        echo "Aluno(a) reprovado !\n";
    }

    //criando um operador ternário com a mesma lógica que o if e else de cima
    $nota = 6;
    echo $nota >= 7 ? "Aluno(a) aprovado !\n" : "Aluno(a) reprovado !\n";
?>