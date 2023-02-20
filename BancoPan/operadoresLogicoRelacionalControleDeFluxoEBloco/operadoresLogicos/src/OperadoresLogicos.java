public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 = true && b2 = false: " + (b1 && b2));
        System.out.println("b1 = true && b3 = true: " + (b1 && b3));

        System.out.println("b2 = false || b3 = true: " + (b2 || b3));
        System.out.println("b2 = false || b4 = false: " + (b2 || b4));

        System.out.println("b1 = true ^ b3 = true: " + (b1 ^ b3));
        System.out.println("b4 = false ^ b1 = true: " + (b4 ^ b1));

        System.out.println("!b1 = true: " + (!b1));
        System.out.println("!b2 = false: " + (!b2));

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));
    }
}
