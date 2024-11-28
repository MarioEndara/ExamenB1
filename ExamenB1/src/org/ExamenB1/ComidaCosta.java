package org.ExamenB1;

public class ComidaCosta extends Comida {

    private final String porciondelPlato;
    private final String ingredientesPredominate;
    private final double precio;
    private final boolean bebida;

    public ComidaCosta(String nombre, String[] ingredientes, int numeroIngredientes, boolean salado,
                       String porciondelPlato, String ingredientesPredominate, double precio, boolean bebida) {
        super(nombre, ingredientes, numeroIngredientes, salado);
        this.porciondelPlato = porciondelPlato;
        this.ingredientesPredominate = ingredientesPredominate;
        this.precio = precio;
        this.bebida = bebida;
    }

    private String getporciondelPlato(){
        return porciondelPlato;
    }
    private String getIngredientesPredominate(){
        return ingredientesPredominate;
    }
    private double getPrecio(){
        return precio;
    }

    private String isBebida() {
        if (bebida) {
            return "Sí";
        } else {
            return "No";
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();

        System.out.println("Tamaño del plato: " + getporciondelPlato()
                + "\nEl ingrediente Predominate es: " +getIngredientesPredominate() +
                "\nEl precio del plato es: $" + getPrecio());
    }

    public void mostrarBebida() {
        System.out.println("¿El plato tiene bebida?");
        System.out.println(isBebida());
    }

}
