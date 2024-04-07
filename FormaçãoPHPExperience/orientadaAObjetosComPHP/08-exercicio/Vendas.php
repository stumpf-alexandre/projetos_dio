<?php

    declare(strict_types=1);

    class Vendas{
        //propriedades
        private string $data;
        private string $produto;
        private int $quantidade;
        private float $valorTotal;

        //construtor
        public function __construct(string $data, string $produto, int $quantidade, float $valorTotal) {
            $this -> data = $data;
            $this -> produto = $produto;
            $this -> quantidade = $quantidade;
            $this -> valorTotal = $valorTotal;
        }

        //Métodos
        public function vender(string $nomeProduto, int $qtd): string {
            if ($nomeProduto == $this -> produto && $qtd < $this -> quantidade) {
                $valorTotal = $this -> valorTotal * $qtd;
                $this -> quantidade -= $qtd;
                $this -> data = date('d/m/Y');
                return "Venda de " . $qtd . " pacotes de " . $this-> produto . ", com o valor R$ " . number_format(($valorTotal), 2, ',', '') . ", na data de " . $this -> data . ". Extoque do produto " . $this -> produto . " alterado para " . $this -> quantidade . " pacote(s)";
            }else{
                if ($this -> quantidade < $qtd) {
                    return "Quantidade do produto insuficiente em extoque";
                }
                return $nomeProduto . " não econtrado";
            }
                
        }
    }

    $venda = new Vendas(
        '0',     //data
        'Sal',   //produto
        10,      //quantidade
        5.00     //valor
     );
    
     echo $venda -> vender('Sal', 6);
    
     echo PHP_EOL;
    
     echo $venda -> vender('Açucar', 2);

     echo PHP_EOL;

     echo $venda -> vender('Sal', 5);

     echo PHP_EOL;

     echo $venda -> vender('Sal', 2);