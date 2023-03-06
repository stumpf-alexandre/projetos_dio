public class Veiculo {
    String placa;
    double valorMercado;
    String tipoCombustivel;
    double alicotaIpva;
    boolean ipvaPago;

    public Veiculo() {
    }

    public Veiculo(String placa, double valorMercado, String tipoCombustivel, double alicotaIpva, boolean ipvaPago) {
        this.placa = placa;
        this.valorMercado = valorMercado;
        this.tipoCombustivel = tipoCombustivel;
        this.alicotaIpva = alicotaIpva;
        this.ipvaPago = ipvaPago;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getAlicotaIpva() {
        return alicotaIpva;
    }

    public void setAlicotaIpva(double alicotaIpva) {
        this.alicotaIpva = alicotaIpva;
    }

    public boolean isIpvaPago() {
        return ipvaPago;
    }

    public void setIpvaPago(boolean ipvaPago) {
        this.ipvaPago = ipvaPago;
    }

}
