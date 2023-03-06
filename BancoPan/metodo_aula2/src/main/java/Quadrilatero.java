public class Quadrilatero {
    // sobrecarga é quando mantem-se o nome do método mas altera os seus
    // parâmetros(sua assinatura)

    // sobrecarga de metodo para calcular um quadrado
    public static void area(double lado) { // (assinatura) => um nome e um parâmetro
        System.out.println("Área do quadrado: " + lado * lado);
    }

    // sobrecarga de metodo para calcular um retângulo
    public static void area(double lado1, double lado2) { // (assinatura) => um nome e dois parâmetros
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    // sobrecarga de metodo para calcular um trapézio
    public static void area(double ladoMaior, double ladoMenor, double altura) { // (assinatura) => um nome e tres
                                                                                 // parâmetros
        System.out.println("Área do trapézio: " + ((ladoMaior + ladoMenor) * altura) / 2);
    }

    // sobrecarga de metodo para calcular um losango
    public static void area(float diagonal1, float diagonal2) { // (assinatura) => um nome e dois parâmetros mas com o
                                                                // tipo de parametro diferente
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}