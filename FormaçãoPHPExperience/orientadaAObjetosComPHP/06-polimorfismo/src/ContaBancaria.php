<?php

    namespace Alsst;

    use Alsst\Contratos\DadosContaBancariaInterface;
    use Alsst\Contratos\OperacoesContaBancariaInterface;

    //classe pai é abstrata
    abstract class ContaBancaria implements DadosContaBancariaInterface, OperacoesContaBancariaInterface {
        //atributos
        protected string $banco;//encapsulando os atributos
        protected string $nomeTitular;//encapsulando os atributos
        protected string $numeroAgencia;//encapsulando os atributos
        protected string $numeroConta;//encapsulando os atributos
        protected float $saldo;//encapsulando os atributos

        //construct
        public function __construct(string $banco, string $nomeTitular, string $numeroAgencia, string $numeroConta, float $saldo){
            $this -> banco = $banco;
            $this -> nomeTitular = $nomeTitular;
            $this -> numeroAgencia = $numeroAgencia;
            $this -> numeroConta = $numeroConta;
            $this -> saldo = $saldo;
        }

        //metodos
        public function depositar(float $valor): string{
            $this -> saldo += $valor;
            return 'Depósito de R$ ' . number_format($valor, 2, ',', '') . ' realizado';
        }

        public function sacar(float $valor): string{
            if($valor > $this -> saldo || $this -> saldo == 0){
                return 'Saldo insuficiente';
            } else{
                $this -> saldo -= $valor;
                return 'Saque de R$ ' . number_format($valor, 2, ',', '') . ' realizado';
            }
        }

        public abstract function obterSaldo(): string;

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
    }