package paquete2;

public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nBeneficiario\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "Tiempo de prestamo en meses: %d\n"
                + "Ciudad del prestamo: %s",
                getBeneficiario().getNombre(),
                getBeneficiario().getApellido(),
                getTiempoPrestamo(),
                ciudad);
        
        return cadena;
    }
   

}
