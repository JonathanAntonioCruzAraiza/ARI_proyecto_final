package mx.edu.utng.menu.meses;

import mx.edu.utng.menu.R;
/**
 * Clase que representa la existencia de un Coche
 */
public class Meses {
    private String nombre;
    private int idDrawable;

    public Meses(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Meses[] ITEMS = {
            new Meses("Enero", R.drawable.enero),
            new Meses("Febrero", R.drawable.febrero),
            new Meses("Marzo", R.drawable.marzo),
            new Meses("Abril", R.drawable.abril),
            new Meses("Mayo", R.drawable.mayo),
            new Meses("Junio", R.drawable.junio),
            new Meses("Julio", R.drawable.julio),
            new Meses("Agosto", R.drawable.agosto),
            new Meses("Septiembre", R.drawable.septiembre),
            new Meses("Octubre", R.drawable.octubre),
            new Meses("Noviembre", R.drawable.noviembre),
            new Meses("Diciembre", R.drawable.diciembre),
    };


    public static Meses getItem(int id) {
        for (Meses item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
