<?php
    echo date('d/m/Y');

    echo PHP_EOL;

    //utilizando classe dateTime com seus métodos
    $data = new DateTime();
    
    var_dump($data);

    echo PHP_EOL;

    //utilizando a função format para formatar dia, mes e ano com 2 digitos
    echo $data -> format('d-m-y');

    echo PHP_EOL;

    //formatando dia, mes e ano com 4 digitos
    echo $data -> format('d-m-Y');

    echo PHP_EOL;

    //formatando dia, mes, ano com 4 digitos, horas, minutos e segundos
    echo $data -> format('d-m-Y H:i:s');

    echo PHP_EOL;

    /**
     * -> P representação de periodo: vem antes de dia, mes, ano e semana
     * Y anos
     * M meses
     * D dias
     * W semanas
     * -> T representação de tempo: vem antes de hora, minuto e segundo
     * H horas
     * M minutos
     * S segundos
     */

    $intervalo = new DateInterval('PT5M'); //adiciona um período de 5 minutos

    $data -> add($intervalo); //acrescenta um intervalo

    var_dump($data);

    $intervalo = new DateInterval('P5Y10M5DT10H50M10S'); //subtrai um periodo de tempo

    $data -> sub($intervalo);

    var_dump($data);