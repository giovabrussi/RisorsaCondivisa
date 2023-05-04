public class Persona extends Thread{
    private String nome;
    private Salvadanaio s;
    
    public Persona(String nome, Salvadanaio s) {
        this.nome = nome;
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public Salvadanaio getS() {
        return s;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            s.addSoldi(1);
        }
    }
}
