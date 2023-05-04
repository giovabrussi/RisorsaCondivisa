public class Salvadanaio {
    private double soldi;

    public Salvadanaio() {
    }

    public Salvadanaio(double soldi) {
        this.soldi = soldi;
    }

    public double getSoldi() {
        return soldi;
    }

    public void setSoldi(double soldi) {
        this.soldi = soldi;
    }

    public synchronized void addSoldi(double s){
        this.soldi += s;
    }
}
