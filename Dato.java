public class Dato {
    private int Numero;
    public Dato(int Numero) {
        this.Numero = Numero;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    @Override
    public String toString() {
        return "" + Numero;
    }
}
