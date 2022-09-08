import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    ArrayList<Sala> listaSalas = new ArrayList<>();

    public ArrayList<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(ArrayList<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    public void registrarSalaPelicula() {
        Scanner sc = new Scanner(System.in);
        SalaPelicula salaPelicula = new SalaPelicula();
        System.out.print("Ingrese el nombre de la sala: ");
        String nombreSala = sc.nextLine();
        salaPelicula.setNombre(nombreSala);

        System.out.print("Ingrese el efecto (1: Normal, 2: 3D, 3: 4D): ");
        int efecto = Integer.parseInt(sc.nextLine());
        salaPelicula.setEfecto(efecto);

        ArrayList<Asiento> listaAsientos = new ArrayList<>();
        switch (efecto) {
            //30 asientos, tipo normal (1)
            case 1 -> listaAsientos = this.crearAsientos(40, 1);
            //30 asientos, tipo medio (2)
            case 2 -> listaAsientos = this.crearAsientos(30, 2);
            //40 asientos, tipo ejecutivo (3)
            case 3 -> listaAsientos = this.crearAsientos(40, 3);

        }
        salaPelicula.setAsientos(listaAsientos);
        if (!this.salaExiste(salaPelicula.getNombre())) {
            listaSalas.add(salaPelicula);
        }
    }

    public void registrarSalaPresentacion() {
        Scanner sc = new Scanner(System.in);
        SalaPresentacion salaPresentacion = new SalaPresentacion();
        System.out.print("Ingrese el nombre de la sala: ");
        String nombreSala = sc.nextLine();
        salaPresentacion.setNombre(nombreSala);

        ArrayList<Asiento> listaAsientos = this.crearAsientos(40, 1);//40 asientos, tipo normal (1)
        salaPresentacion.setAsientos(listaAsientos);

        System.out.print("Ingrese el tipo de pantalla (1: Editable, 2: No editable): ");
        int tipoPantalla = Integer.parseInt(sc.nextLine());
        salaPresentacion.setTipoPantalla(tipoPantalla);

        if (!this.salaExiste(salaPresentacion.getNombre())) {
            this.getListaSalas().add(salaPresentacion);
        }
    }

    public ArrayList<Asiento> crearAsientos(int cantidad, int tipo) {
        ArrayList<Asiento> listaAsientos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Asiento asiento = new Asiento();
            asiento.setNumero(i + 1);
            asiento.setTipo(tipo);
            listaAsientos.add(asiento);
        }
        return listaAsientos;
    }

    public boolean salaExiste(String nombreSala) {
        boolean existeSala = false;
        for (Sala sala : listaSalas) {
            if (sala.getNombre().equals(nombreSala)) {
                existeSala = true;
                break;
            }
        }
        return existeSala;
    }

    public void mostrarSalas() {
        for (Sala sala : listaSalas) {
            if(sala instanceof SalaPelicula){
                SalaPelicula pelicula = (SalaPelicula) sala;
                System.out.println("Tipo: Película");
                pelicula.infoSala();
            }
            if(sala instanceof SalaPresentacion){
                SalaPresentacion presentacion = (SalaPresentacion) sala;
                System.out.println("Tipo: Presentación");
                presentacion.infoSala();
            }
        }
    }
}
