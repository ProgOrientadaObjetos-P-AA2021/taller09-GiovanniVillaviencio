package paquete4;

import paquete2.*;

public final class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String nombreCentro;
    private double valorCarrera;
    private double valorMensualCostoPres;

    public PrestamoEducativo(Persona p, int t, String c, String nE, String nC,
            double vC) {
        super(p, t, c);
        nivelEstudio = nE;
        nombreCentro = nC;
        valorCarrera = vC;
    }
    
    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualCostoPres() {
        return valorMensualCostoPres;
    }

    public void setValorMensualCostoPres() {
        this.valorMensualCostoPres = (valorCarrera / getTiempoPrestamo())
                - ((valorCarrera / getTiempoPrestamo()) * 0.10);
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Nivel de estudios: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor mensual del pago del prestamo: %.2f\n",
                cadenaFinal,
                getNivelEstudio(),
                getNombreCentro(),
                getValorCarrera(),
                getValorMensualCostoPres());

        return cadenaFinal;
    }
}
