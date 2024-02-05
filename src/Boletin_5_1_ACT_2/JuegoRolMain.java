package Boletin_5_1_ACT_2;

public class JuegoRolMain {
    public static void main(String[] args) {
        try {
            Mago magoA = new Mago("Paco", TRaza.HUMANO, 10, 18, 100);
            Mago magoB = new Mago("Mewing", TRaza.ORCO, 12, 17, 43);
            Clerigo clerigoA = new Clerigo("Zupi", TRaza.ELFO, 15, 16, 60, "Congoleño");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoA);

            magoA.aprendeHechizo("Bola fuego");
            magoA.aprendeHechizo("Teletransporte");
            magoB.aprendeHechizo("Mewing");

            System.out.println(magoA);
            System.out.println(magoB);

            magoA.lanzaHechizo(magoB, "Teletransporte");
            magoB.lanzaHechizo(magoA, "Mewing");

            clerigoA.curar(clerigoA);

            magoA.lanzaHechizo(magoB, "Bola fuego");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoA);
        } catch (PersonajeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
