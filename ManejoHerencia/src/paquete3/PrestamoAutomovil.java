package paquete3;

import paquete2.*;

public final class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marca;
    private Persona garante1;
    private double costoAuto;
    private double valorMensualPagoPres;

    public PrestamoAutomovil(Persona b, int t, String c, String ta, String ma,
            Persona g, double ca) {
        super(b, t, c);
        tipoAuto = ta;
        marca = ma;
        garante1 = g;
        costoAuto = ca;
    }
    
    @Override
    public void setCiudad(String ciudad){
        this.ciudad = ciudad.toLowerCase();
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getCostoAuto() {
        return costoAuto;
    }

    public void setCostoAuto(double costoAuto) {
        this.costoAuto = costoAuto;
    }

    public double getValorMensualPagoPres() {
        return valorMensualPagoPres;
    }

    public void setValorMensualPagoPres() {
        this.valorMensualPagoPres = costoAuto / getTiempoPrestamo();
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s"
                + "Tipo de auto: %s\n"
                + "Marca del auto: %s\n"
                + "Garante\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "Costo del auto: %.2f\n"
                + "Valor mensual de prestamo automovil: %.2f\n",
                cadenaFinal,
                getTipoAuto(),
                getMarca(),
                getGarante1().getNombre(),
                getGarante1().getApellido(),
                getCostoAuto(),
                getValorMensualPagoPres());

        return cadenaFinal;
    }

}
