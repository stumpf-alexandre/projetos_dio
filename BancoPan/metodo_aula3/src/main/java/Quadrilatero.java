public class Quadrilatero {
    // sobrecarga é quando mantem-se o nome do método mas altera os seus
    // parâmetros(sua assinatura)
    // aqui o o return vai ser utilizado

    // sobrecarga de metodo para calcular um quadrado
    public static double area(double lado) { // (assinatura) => um nome e um parâmetro
        return lado * lado;
    }

    // sobrecarga de metodo para calcular um retângulo
    public static double area(double lado1, double lado2) { // (assinatura) => um nome e dois parâmetros
        return lado1 * lado2;
    }

    // sobrecarga de metodo para calcular um trapézio
    public static double area(double ladoMaior, double ladoMenor, double altura) { // (assinatura) => um nome e tres
                                                                                   // parâmetros
        return ((ladoMaior + ladoMenor) * altura) / 2;
    }

    // sobrecarga de metodo para calcular um losango
    public static float area(float diagonal1, float diagonal2) { // (assinatura) => um nome e dois parâmetros mas com o
                                                                 // tipo de parametro diferente
        return (diagonal1 * diagonal2) / 2;
    }
}