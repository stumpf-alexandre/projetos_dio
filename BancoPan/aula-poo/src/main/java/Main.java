public class Main {
    public static void main(String[] args) {
        // criando um objeto do tipo da classe vazio
        Carro carro = new Carro();

        carro.setCor("azul");
        carro.setModelo("BMW Série 3");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(
                "Valor total de um tanque cheio de um " + carro.getModelo() + " é R$" + carro.totalValorTanque(6.46));

        // criando um objeto e passando os valores pelo construtor
        Carro carro1 = new Carro("cinza", "Mercedes-Benz Classe C", 66);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(
                "Valor total de um tanque cheio de um " + carro1.getModelo() + " é R$" + carro1.totalValorTanque(6.46));
    }
}
