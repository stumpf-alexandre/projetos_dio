<?php

    namespace Alsst;

    class ContaBancaria {
        //atributos
        private string $banco;//encapsulando os atributos
        private string $nomeTitular;//encapsulando os atributos
        private string $numeroAgencia;//encapsulando os atributos
        private string $numeroConta;//encapsulando os atributos
        private float $saldo;//encapsulando os atributos

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

        public function exibirNomeENumeroDaContaDoTitular(): array{
            return [
                'nomeTitular' => $this -> nomeTitular,
                'numeroConta' => $this -> numeroConta,
            ];
        }

        //criando getters e setters dos atributos
        //getter
        public function getBanco(): string{
            return $this->banco;
        }

        public function getNomeTitular(): string{
            return $this->nomeTitular;
        }

        public function getNumeroAgencia(): string{
            return $this->numeroAgencia;
        }

        public function getNumeroConta(): string{
            return $this->numeroConta;
        }

        public function getSaldo(): float{
            return $this->saldo;
        }

        //setter
        public function setBanco(string $banco): void{
            $this->banco = $banco;
        }

        public function setNomeTitular($nomeTitular): void{
            $this->nomeTitular = $nomeTitular;
        }

        public function setNumeroAgencia($numeroAgencia): void{
            $this->numeroAgencia = $numeroAgencia;
        }        

        public function setNumeroConta($numeroConta): void{
            $this->numeroConta = $numeroConta;
        }
         
        public function setSaldo($saldo): void{
            $this->saldo = $saldo;
        }
    }