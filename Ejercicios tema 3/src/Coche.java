public class Coche {

    public static void main(String[] args) {
        Coche miCoche = new Coche(2);
        miCoche.addPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }

    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void addPuerta() {
        numPuertas++;
    }
}
