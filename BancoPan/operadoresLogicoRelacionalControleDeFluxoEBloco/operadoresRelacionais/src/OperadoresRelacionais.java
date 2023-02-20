public class OperadoresRelacionais {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Ciclano";
        boolean b1 = true;
        boolean b2 = false;
        long l1 = 1597;
        long l2 = 8997;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2)); // comparadores de similaridade
        System.out.println("i1 != i2 " + (i1 != i2)); // comparadores de similaridade
        System.out.println("i1 > i2 " + (i1 > i2)); // comparadores de tamanho
        System.out.println("i1 <= i2 " + (i1 <= i2)); // comparadores de tamanho

        System.out.println("f1 == f2 " + (f1 == f2)); // comparadores de similaridade
        System.out.println("f1 != f2 " + (f1 != f2)); // comparadores de similaridade
        System.out.println("f1 >= f2 " + (f1 >= f2)); // comparadores de tamanho
        System.out.println("f1 < f2 " + (f1 < f2)); // comparadores de tamanho

        System.out.println("c1 == c2 " + (c1 == c2)); // comparadores de similaridade
        System.out.println("c1 != c2 " + (c1 != c2)); // comparadores de similaridade
        System.out.println("c1 > c2 " + (c1 > c2)); // comparadores de tamanho
        System.out.println("c1 <= c2 " + (c1 <= c2)); // comparadores de tamanho

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        // System.out.println(s1 >= s2); //as strings não podem ter comparação de
        // tamanho
        // System.out.println(s1 < s2); //as strings não podem ter comparação de tamanho

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        // System.out.println(b1 > b2); //os booleanos não podem ter comparação de
        // tamanho
        // System.out.println(b1 <= b2); //os booleanos não podem ter comparação de
        // tamanho

        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 != l2 " + (l1 != l2));
        System.out.println("l1 < l2 " + (l1 < l2));
        System.out.println("l1 >= l2 " + (l1 >= l2));

        // System.out.println("s1 == c2 " + (s1 == c2)); //não podemos comparar essas
        // variaveis
        System.out.println("l1 == i2 " + (l1 == i2)); // podemos comparar essas variaveis por serem numéricos
        System.out.println("y1 == h1 " + (y1 == h1)); // podemos comparar essas variaveis por serem numéricos
    }
}
