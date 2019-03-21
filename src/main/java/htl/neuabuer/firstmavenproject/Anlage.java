package htl.neuabuer.firstmavenproject;

public class Anlage {

    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
    }

    public double jahresAfa() {
        return anschaffungswert / nutzungsdauer;
    }

    public void updateBuchwert(int jahreGenutzt) {
        buchwert = anschaffungswert - jahreGenutzt * jahresAfa();
        if (buchwert < 1.0) {
            buchwert = 1.0;
        }
    }

    public double getBuchwert() {
        return buchwert;
    }
}
