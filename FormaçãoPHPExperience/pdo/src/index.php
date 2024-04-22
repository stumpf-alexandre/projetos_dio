<?php
    require 'Produto.php';

    $produto = new Produto();

    switch($_GET['operacao']){
        case 'list':
            echo '<h3>Produtos: </h3>';
            foreach($produto -> list() as $value){
                echo 'Id: ' . $value['id'] . '<br> Descrição: ' . $value['descricao'] . '<hr>';
            }
            break;

        case 'insert':
            $status = $produto -> insert('Produto teste do Alexandre 01');
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro inserido com sucesso';
            break;

        case 'update':
            $status = $produto -> update('Produto teste alterado do Alexandre 01', 1);
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro atualizado com sucesso';
            break;

        case 'delete':
            $status = $produto -> delete(1);
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro deletado com sucesso';
            break;
    }