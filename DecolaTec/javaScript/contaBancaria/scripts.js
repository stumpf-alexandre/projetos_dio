//classe pai
class ContaBancaria{
//parâmetros no construtor
    constructor(agencia, numero, tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = 0;
    }

//getter e setter
    get saldo(){
        return this._saldo;
    }

    set saldo(valor){
        this._saldo = valor;
    }

//metodo sacar
    sacar(valor){
        if(valor > this._saldo){
            return "Saldo insuficiente"
        }else{
            this._saldo = this._saldo - valor;
            return this._saldo;
        }
    }

//metodo depositar
    depositar(valor){
        this._saldo = this._saldo + valor;
        return this._saldo;
    }
}

//classe filha
class ContaCorrente extends ContaBancaria{
    constructor(agencia, numero, cartaoCredito){
        super(agencia, numero);
        this.tipo = 'COnta Corrente';
        this._cartaoCredito = cartaoCredito;
    }

//getter e setter
    get cartaoCredito(){
        return this._cartaoCredito;
    }

    set cartaoCredito(valor){
        this._cartaoCredito = valor;
    }
}

//classe filha
class ContaPoupanca extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Conta Poupanca';
    }
}

//classe filha
class ContaUniversitaria extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Conta Universitária';
    }

//metodo sacar
    sacar(valor){
        if(valor > 500){
            return "Operação excedeu o limite";
        }else{
            this._saldo = this._saldo - valor;
            return this._saldo;
        }
    }   
}


//COMANDOS FEITOS NO CONSOLE
//const minhaCOnta = new ContaCorrente(1, 234, true)
//undefined
//minhaCOnta.saldo
//0
//minhaCOnta.depositar(1000)
//1000
//minhaCOnta.sacar(500)
//500
//minhaCOnta.saldo
//500
//minhaCOnta.sacar(600)
//'Saldo insuficiente'
//const contaPoup = new ContaPoupanca(1, 22)
//undefined
//const contaUni = new ContaUniversitaria(1, 33)
//undefined
//contaUni.depositar(1000)
//1000
//contaUni.saldo
//1000
//contaUni.sacar(550)
//'Operação excedeu o limite'