package edu.alexandre.metodos;

public class metodos {
    // Métodos
    // Todas as ações das aplicações são consideradas
    // métodos.
    // Uma classe é definida por atributos e métodos.
    // Já vimos que atributos são, em sua grande
    // maioria, variaveis de diferentes tipos e
    // valores. Os métodos, por sua vez, correspondem
    // a função ou sub-rotinas disponíveis dentro da
    // nossa classe.
    // Critérios de nomeação de métodos
    // Esses critérios não são obrigatórios, mas é
    // recomendável que sejam seguidos, pois essas
    // convenções facilitam a vida dos programadores
    // ao trabalharem em códigos de forma colaborativa.
    // Ao seguir estas convenções, tornamos o código
    // mais legível para nós e também para outras
    // pessoas. Para métodos, os critérios são:
    // Deve ser nomeado como verbo;
    // seguir o padrão camelCase (todas as letras
    // minusculas com a exceção da primeira letra da
    // segunda palavra).
    // Exemplo:

    // somar (int n1, int n2) {}

    // abrirConexao () {}

    // concluirProcessamento () {}

    // findById (int id) {}

    // Atenção! Não existe em java o conceito de
    // métodos globais. Todos os métodos devem SEMPRE
    // ser definidos dentro de uma classe.

    // Critérios de definição de métodos
    // Mas, como sabemos a melhor forma de definir os
    // métodos das nossas classes? Para chegar à essa
    // conclusão, somos auxiliados por uma convenção
    // estrutural para todos os métodos. Essa
    // convenção é determinada pelos aspectos abaixo:
    // 1-Qual a proposta principal do método? Você
    // deve se perguntar constantemente até
    // compreender a real finalidade do mesmo.
    // 2-Qual o tipo de retorno esperado após executar
    // o método? Você deve analisar se o método será
    // responsável por retornar algum valor ou não.
    // Caso o método não retorne nenhum valor, ele
    // será representado pela palavra-chave void.

    // 1-Quais os parâmetros serão necessários para
    // execução do método? Os métodos as vezes
    // precisão de argumentos como critérios para a
    // execução.

    // 2-O método possui o risco de apresentar alguma
    // exceção? Exceções são comuns na execução de
    // métodos, as vezes é necessário prever e tratar
    // a possível existência de uma exceção.

    // 3-Qual a visibilidade do método? Será necessário
    // que o método seja visivel a toda aplicação,
    // somente em mesmo pacote, através de herança ou
    // somente a nível a própria classe.
    // Exemplo:

    public double somar(int num1, int num2) {
        // LOGICA - FINALIDADE DO MÉTODO
        return num1 + num2;
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO
        // AQUI NÃO PRECISA DE RETURN
        // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }

    // throws Exception : indica que o método ao ser
    // utilizado poderá gerar uma exceção.
    public double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / divisor;
    }

    // este método não pode ser visto por outra classe
    // no projeto.
    private void metodoPrivado() {
    }

    // alguns equívocos estruturais
    public void validar() {
        // este método deveria retornar algum valor
        // no caso boolean (true ou false)
    }

    public void calcularEnviar() {
        // um método deve representar uma única resposta
    }

    public void gravarCliente(String nome, String cpf, int idade) {
        // este método tem a finalidade de gravar
        // informações de um cliente, por que não criar
        // um objeto cliente e passar como parâmetro?
        // veja abaixo
    }

    public void gravarCliente(Cliente cliente) {
    }

    // ou

    public void gravar(Cliente cliente) {
    }
}