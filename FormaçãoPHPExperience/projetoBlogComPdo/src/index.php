<?php
    require 'Blog.php';

    $blog = new Blog();

    switch($_GET['operacao']){
        case 'list':
            echo '<h3>Blog: </h3>';
            foreach($blog -> list() as $value){
                echo 'Id: ' . $value['id'] . '<br> Post: ' . $value['post'] . '<hr>';
            }
            break;

        case 'insert':
            $status = $blog -> insert('Blog teste do Alexandre 01');
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro inserido com sucesso';
            break;

        case 'update':
            $status = $blog -> update('Blog teste alterado do Alexandre 01', 1);
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro atualizado com sucesso';
            break;

        case 'delete':
            $status = $blog -> delete(1);
            if (!$status) {
                echo 'Não foi possivel executar a operação';
                return false;
            }
            echo 'Registro deletado com sucesso';
            break;
    }