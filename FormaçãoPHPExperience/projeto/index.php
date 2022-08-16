<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projeto em PHP</title>
</head>
<body>
    <h1>String</h1>
    <?php
        $string = "Curso da DIO";
        $numero = 50;
        $array = array("PHP", "HTML", "CSS", "JAVA");
        date_default_timezone_set('America/Sao_Paulo');
        $data = date("d/m/Y H:i:s");
    ?>

    <h4>
        Esse é o curso de tipos de variáveis de PHP, 
        essa é uma variável do tipo string,
        utilizamos aspas simples (' ') ou aspas duplas (" ") : 
        <?php
            echo $string;
        ?>
    </h4>

    <h1>Números</h1>
    <h4>Essa é uma variavel do tipo número/integer 
        para implementar essa variavel essa variavel 
        utilizamos somente os números desta forma : 
        <?php
            echo $numero;
        ?>
    </h4>

    <h1>Arrays</h1>
    <h4>Essa é uma variável com um array, para implementar 
        um array em uma variável utilizamos desta forma : 
        <?php
            print_r($array);
        ?>
    </h4>

    <h1>Datas</h1>
    <h4>Vamos agora implementar uma variável do tipo datas, 
        para implementar a variável com datas utilizamos 
        uma função própria do PHP desta forma : 
        <?php
            print $data;
        ?>
    </h4>
</body>
</html>