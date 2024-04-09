<?php

    //código com exception e try catch e finally
    function validarUsuario(array $usuario){
        if(empty($usuario['codigo']) || empty($usuario['nome']) || empty($usuario['idade'])){
            throw new Exception("Campos obrigatórios não foram preenchidos!");
        }
        return true;
    }

    $usuario = [
        'codigo' => 1,
        'nome' => '',
        'idade' => 57,
    ];

    $status = false;

    try {
        $status = validarUsuario($usuario);
    } catch (Exception $e) {
        echo $e -> getMessage();
    } finally {
        echo "Status da Operação: " . (int)$status; //cast
        die();
    }

    echo "\n... executando ...\n";