<?php
    echo date("d\n");//da o dia atual
    echo date("m\n");//da o mes atual
    echo date("y\n");//da o ano atual
    echo date("Y\n");//da o ano completo atual

    echo date("d/m/Y\n");//da a data com dia mes e ano atual

    //setando a hora para ficar na hora do brasil
    date_default_timezone_set('America/Sao_Paulo');
    $data12 = date("h\n");
    $data24 = date("H\n");
    $hora = date("H:i:s");
    $tempo = date("d/m/Y H:i:s\n");

    echo $data12;
    echo $data24;
    echo $hora;
    echo $tempo;
?>