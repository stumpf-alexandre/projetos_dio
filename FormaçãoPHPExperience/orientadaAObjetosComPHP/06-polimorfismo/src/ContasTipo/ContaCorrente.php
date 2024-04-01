<?php

    namespace Alsst\ContasTipo;

    use Alsst\ContaBancaria;

    class ContaCorrente extends ContaBancaria{
        const TAXA = 25;
        const TIPO_CONTA = "Conta Corrente";

        //construct
        public function __construct(string $banco, string $nomeTitular, string $numeroAgencia, string $numeroConta, float $saldo){
            parent::__construct($banco, $nomeTitular, $numeroAgencia, $numeroConta, $saldo);
        }

        //metodos
        public function obterSaldo(): string{
            return 'Seu saldo atual é: R$ ' . number_format(($this -> saldo - self::TAXA), 2, ',', '') . ' realizado';
        }
    }