package edu.alexandre.escopo;

public class Escopo {
    // Escopo
    // O escopo pode ser entendido como o ambiente
    // onde uma variável pode ser acessada. Em java,
    // o escopo de variáveis vai de acordo com o
    // bloco onde ela foi declarada.

    // A variável é criada no primeiro acesso à ela,
    // se tornando inacessível após o interpretador
    // sair do bloco de execução ao qual ela pertence.
    // Portanto, esta variável não pode ser lida ou
    // manipulada por rotinas e códigos que estão
    // fora do seu bloco de declaração, ou seja,
    // fora do escopo da variável.

    // Em uma classe, podemos visualizar a diferença
    // de escopo. Os atributos (variáveis) são
    // declaradas no corpo principal da classe, sendo
    // portanto acessivel por todos os métodos.

    // Caso você declare uma variável DENTRO DE UM
    // MÉTODO, o escopo dessa variável está limitado
    // apenas ao corpo desse método, ou seja, dentro
    // das chaves que limitam o método.

    // Uma parte fundamental na elaboração de
    // algoritmos simples ou complexos é determinar a
    // localização do código em questão. Sem um
    // domínio sobre escopo de código seu projeto
    // tende a conter falhas estruturais e
    // comprometer a proposta principal da aplicação.

}