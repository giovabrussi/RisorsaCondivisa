public class App {
    public static void main(String[] args) throws Exception {
        Salvadanaio s = new Salvadanaio();
        Persona p1 = new Persona("Mario", s);
        Persona p2 = new Persona("Piero", s);

        p1.start();
        p2.start();

        p1.join();
        p2.join();
        
        System.out.println(s.getSoldi());

    }
}