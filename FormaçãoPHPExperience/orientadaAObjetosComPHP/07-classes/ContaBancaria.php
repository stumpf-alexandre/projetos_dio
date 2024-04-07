<?php

//o PHP vai verificar a tipagem das propriedades
declare(strict_types=1);

class ContaBancaria{
    //propriedades ou atributos de classe
    private string $banco;
    private string $nomeTitular;
    private string $numeroAgencia;
    private string $numeroConta;
    private float $saldo;

    //Construtor
    public function __construct(string $banco, string $nomeTitular, string $numeroAgencia, string $numeroConta, float $saldo) {
        $this -> banco = $banco;
        $this -> nomeTitular = $nomeTitular;
        $this -> numeroAgencia = $numeroAgencia;
        $this -> numeroConta = $numeroConta;
        $this -> saldo = $saldo;
    }

    //Métodos ou funções
    public function obterSaldo(): string {
        return 'Seu saldo atual é: R$ ' . number_format(($this -> saldo), 2, ',', '');
    }

    public function depositar(float $valor): string {
        $this -> saldo += $valor;
        return 'Depósito de R$ ' . number_format(($valor), 2, ',', '') . " realizado com sucesso!";
    }

    public function sacar(float $valor): string {
        if ($valor > $this -> saldo) {
            return 'Saldo insuficiente';
        }else{
            $this -> saldo -= $valor;
            return 'Saque de R$ ' . number_format(($valor), 2, ',', '') . " realizado com sucesso!";
        }
    }
}

$conta = new ContaBancaria(
    'Banco do Brasil',  //banco
    'Alexandre Stumpf', //nomeTitular
    '8244',             //numeroAgencia
    '57354-10',         //numeroConta
    0                   //saldo
 );

 echo $conta -> obterSaldo();

 echo PHP_EOL;

 echo $conta -> sacar(300.00);

 echo PHP_EOL;

 echo $conta -> obterSaldo();

 echo PHP_EOL;

 echo $conta -> depositar(500.00);

 echo PHP_EOL;

 echo $conta -> obterSaldo();

 echo PHP_EOL;

 echo $conta -> sacar(300.00);

 echo PHP_EOL;

 echo $conta -> obterSaldo();