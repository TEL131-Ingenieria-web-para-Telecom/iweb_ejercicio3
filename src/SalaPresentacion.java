public class SalaPresentacion extends Sala {
    private int tipoPantalla;

    public int getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(int tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    @Override
    public void infoSala() {
        super.infoSala();
        System.out.println("Tipo de pantalla: " + tipoPantalla);
    }
}
