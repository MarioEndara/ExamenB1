package org.ExamenB1;

public class ComidaOriente extends Comida{

    private final String ubicacion;
    private final double precio;

    public ComidaOriente(String nombre, String[] ingredientes, int numeroIngredientes, boolean salado,
                         String ubicacion, double precio) {
        super(nombre, ingredientes, numeroIngredientes, salado);
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    private String getUbicacion() {
        return ubicacion;
    }
    private double getPrecio() {
        return precio;
    }



    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Ubicado en: " + getUbicacion());
    }

    public void mostrarPrecio() {
        System.out.print("El precio es $" + getPrecio());
    }
}