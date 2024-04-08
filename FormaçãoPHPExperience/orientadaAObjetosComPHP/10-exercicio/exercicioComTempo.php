<?php

    $data = new DateTime();

    echo $data -> format('d/m/Y - H:m:s');

    echo PHP_EOL;

    $intervalo = new DateInterval('P5DT10H50M'); //subtrai um periodo de tempo

    $data -> sub($intervalo);

    echo $data -> format('d/m/Y - H:m:s');