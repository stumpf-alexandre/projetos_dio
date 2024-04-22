<?php

    declare(strict_types=1); //informar ao navegador para ver todos os tipos

    class Blog{
        /** 
         * @var PDO
        */

        private $conexao;

        public function __construct(){
            try {
                $this -> conexao = new PDO('mysql:host=mysql;dbname=exemplo', 'root', '12345');
            } catch (Exception $e) {
                echo $e -> getMessage();
                die();
            }
        }

        public function list(): array{
            $sql = 'select * from blogs';

            $posts = [];

            foreach ($this -> conexao -> query($sql) as $key => $value){
                array_push($posts, $value);
            }
            return $posts;
        }

        public function insert(string $post): int{
            $sql = 'insert into blogs(post) value(?)';

            $prepare = $this -> conexao -> prepare($sql);

            $prepare -> bindParam(1, $post);
            $prepare -> execute();

            return $prepare -> rowCount();
        }

        public function update(string $post, int $id): int{
            $sql = 'update blogs set post = ? where id = ?';

            $prepare = $this -> conexao -> prepare($sql);

            $prepare -> bindParam(1, $post);
            $prepare -> bindParam(2, $id);

            $prepare -> execute();
            return $prepare -> rowCount();
        }

        public function delete(int $id): int{
            $sql = 'delete from blogs where id = ?';

            $prepare = $this -> conexao -> prepare($sql);

            $prepare -> bindParam(1, $id);
            $prepare -> execute();

            return $prepare -> rowCount();
        }
    }