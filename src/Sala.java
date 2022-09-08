import java.util.ArrayList;

public class Sala {
    private String nombre;
    private ArrayList<Asiento> asientos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public void infoSala(){
        System.out.println("Nombre sala: " + nombre);
        System.out.println("Cantidad de asientos: " + asientos.size());
    }
}
