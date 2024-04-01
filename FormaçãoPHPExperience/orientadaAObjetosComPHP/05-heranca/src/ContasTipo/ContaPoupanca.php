<?php

    namespace Alsst\ContasTipo;

    use Alsst\ContaBancaria;

    class ContaPoupanca extends ContaBancaria{
        const RENDIMENTO = 0.03;
        const TIPO_CONTA = "Conta Poupança";

         //construct
         public function __construct(string $banco, string $nomeTitular, string $numeroAgencia, string $numeroConta, float $saldo){
            parent::__construct($banco, $nomeTitular, $numeroAgencia, $numeroConta, $saldo);
        }

        //metodos
        public function obterSaldo(): string{
            return 'Seu saldo atual é: R$ ' . number_format(($this -> saldo + ($this -> saldo * self::RENDIMENTO)), 2, ',', '') . ' realizado';
        }
    }