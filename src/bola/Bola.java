package bola;

public class Bola {

    private double jariJari;

    public double setjariJari(double jari) {
        return this.jariJari = jari;
    }

    public double showDiameter() {
        return jariJari * 2;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return (Math.PI * Math.pow(jariJari, 3) / 3) * 4;
    }

    public void cetak() {
        System.out.println("Diameter\t : " + showDiameter()
                 + "\nLuas permukaan\t : " + showLuasPermukaan()
                 + "\nVolume\t         : " + showVolume());
    }
}