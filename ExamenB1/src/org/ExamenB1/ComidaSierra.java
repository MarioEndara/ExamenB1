package org.ExamenB1;

public class ComidaSierra extends Comida {

    private final String nombreProvincia;
    private final double costo;
    private final boolean con_arroz;
    private final String grupo;

    public  ComidaSierra(String nombre, String[] ingredientes, int numeroIngredientes, boolean salado,
                         String nombreProvincia, double costo, boolean con_arroz, String grupo) {
        super(nombre, ingredientes, numeroIngredientes, salado);
        this.nombreProvincia = nombreProvincia;
        this.costo = costo;
        this.con_arroz = con_arroz;
        this.grupo = grupo;
    }

    private String getNombreProvincia() {
        return nombreProvincia;
    }

    private double getCosto() {
        return costo;
    }

    private String isCon_arroz() {
        if (con_arroz) {
            return "Sí";
        } else {
            return "No";
        }
    }

    private String getGrupo() {
        return grupo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El plato es típico de: " +  getNombreProvincia());
        System.out.println("Su costo es: $" + getCosto());
        System.out.println("El plato tiene arroz: " + isCon_arroz());
    }

    public void mostrarGrupo() {
        System.out.println("El grupo que prepara y comercializa el plato es: " + getGrupo());
    }
}