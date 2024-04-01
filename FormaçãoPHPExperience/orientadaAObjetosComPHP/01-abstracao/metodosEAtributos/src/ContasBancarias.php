<?php

    namespace Alsst;

    class ContasBancarias {
        //atributos
        public string $banco = "Banco Inter";
        public string $nomeTitular = "Alexandre Stumpf";
        public string $numeroAgencia = "8244";
        public string $numeroConta = "57354-10";
        public float $saldo = 0;

        //metodos
        public function exibirDadosDaConta(): array{
            return [
                'banco' => $this -> banco,
                'nomeTitular' => $this -> nomeTitular,
                'numeroAgencia' => $this -> numeroAgencia,
                'numeroConta' => $this -> numeroConta,
                'saldo' => $this -> saldo,
            ];
        }
    }