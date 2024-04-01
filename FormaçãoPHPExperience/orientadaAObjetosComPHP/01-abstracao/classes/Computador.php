<?php
class Computador {
    //atributo da classe
    public string $marca = "Dell";
    public string $nome = "Inspiron";
    public int $tela = 14;

    //metodo da classe
    public function exibirDadosComputador(): array{
        return [
            'marca' => $this -> marca,
            'nome' => $this -> nome,
            'tela' => $this -> tela,
        ];
    }
}

$computador = new Computador();

    var_dump($computador);//impressão da classe

    var_dump($computador -> exibirDadosComputador());//array do método

?>