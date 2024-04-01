<?php

    namespace Alsst\Contratos;

    interface DadosContaBancariaInterface{
        public function getBanco(): string;
        public function getNomeTitular(): string;
        public function getNumeroAgencia(): string;
        public function getNumeroConta(): string;
    }