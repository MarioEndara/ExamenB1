package org.ExamenB1;

public class Main {

    public static void main(String[] args) {

        String[] ingredientesSierra = new String[3];
        ingredientesSierra[0] = "Chancho";
        ingredientesSierra[1] = "Mote";
        ingredientesSierra[2] = "Papa";

        ComidaSierra hornado = new ComidaSierra("Hornado", ingredientesSierra, 3, true,
                "Cuenca", 4.0, false, "El Pulpo");


        String[] ingredientesCosta = new String[4];
        ingredientesCosta[0] = "Cebolla";
        ingredientesCosta[1] = "Albacora";
        ingredientesCosta[2] = "Yuca";
        ingredientesCosta[3] = "Chifle";

        ComidaCosta encebollado = new ComidaCosta("Encebollado", ingredientesCosta, 4,
                true, "Dos Personas", "Albacora", 3.50, false);


        String[] ingredientesOriente = new String[3];
        ingredientesOriente[0] = "Yuca";
        ingredientesOriente[1] = "Tilapia";
        ingredientesOriente[2] = "Arroz";

        ComidaOriente tonga = new ComidaOriente("Tonga", ingredientesOriente, 3, true,
                "Tena", 5);

        System.out.println("GRUPO 03 --- COMIDA TÍPICA");
        hornado.mostrarInfo();
        hornado.mostrarGrupo();

        System.out.println();
        encebollado.mostrarInfo();
        encebollado.mostrarBebida();

        System.out.println();
        tonga.mostrarInfo();
        tonga.mostrarPrecio();

    }
}
