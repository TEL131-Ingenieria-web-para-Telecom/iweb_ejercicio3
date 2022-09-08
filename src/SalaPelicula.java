public class SalaPelicula extends Sala{
    private int efecto;

    public int getEfecto() {
        return efecto;
    }

    public void setEfecto(int efecto) {
        this.efecto = efecto;
    }

    @Override
    public void infoSala(){
        super.infoSala();
        System.out.println("Efecto: " + efecto);
    }
}
