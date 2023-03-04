public class Menssagem {
    public static void obterMenssagem(int hora) {
        /**
         * if (hora >= 5 && hora <= 12) {
         * System.out.println("Bom dia, são " + hora + " horas da manhã");
         * } else if (hora >= 13 && hora <= 17) {
         * System.out.println("Boa tarde, são " + hora + " horas da tarde");
         * } else {
         * System.out.println("Boa noite, são " + hora + " horas da noite");
         * }
         */
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                menssagemBomDia(hora);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                menssagemBoaTarde(hora);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                menssagemBoaNoite(hora);
                break;
            default:
                erroHora();
                break;
        }
    }

    public static void menssagemBomDia(int hora) {
        System.out.println("Bom dia, são " + hora + " horas da manhã");
    }

    public static void menssagemBoaTarde(int hora) {
        System.out.println("Boa tarde, são " + hora + " horas da tarde");
    }

    public static void menssagemBoaNoite(int hora) {
        System.out.println("Boa noite, são " + hora + " horas da noite");
    }

    public static void erroHora() {
        System.out.println("Horario invalida");
    }
}