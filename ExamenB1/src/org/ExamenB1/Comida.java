package org.ExamenB1;

public abstract class Comida {

    // ATRIBUTOS
    private final String nombre;
    private final String[] ingredientes;
    private final int numeroIngredientes;
    private final boolean salado;

    // CONSTRUCTOR
    protected Comida (String nombre, String[] ingredientes, int numeroIngredientes, boolean salado) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.numeroIngredientes = numeroIngredientes;
        this.salado = salado;
    }

    // GETTERS & SETTERS
    private String getNombre() { return nombre; }
    private void getIngredientes() {
        System.out.println("INGREDIENTES");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
    private int getNumeroIngredientes() { return numeroIngredientes; }
    private boolean isSalado() { return salado; }

    // OTROS MÉTODOS
    protected void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());

        getIngredientes();

        System.out.println("Número de ingredientes: " + getNumeroIngredientes());

        if (isSalado()) System.out.println("Comida salada");
        else System.out.println("Comida Dulce");
    }
}
