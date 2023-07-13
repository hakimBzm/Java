import java.util.Random; // import des classes nécessaire

public class RandomNumbers { // déclaration classe random
    public static void main(String[] args) {
        Random random = new Random(); // instance de classe random

        int nombre1 = random.nextInt(1001); // déclaration d'un nombre aléatoire entre 0 et 1000 inclus
        int nombre2 = random.nextInt(1001); // déclaration d'un nombre aléatoire entre 0 et 1000 inclus
        int nombre3 = random.nextInt(1001);// déclaration d'un nombre aléatoire entre 0 et 1000 inclus

        while (!(nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 != 0)) {
            // condition permettant de savoir si le nombre sortie est pair ou impair
            nombre1 = random.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000
            nombre2 = random.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000
            nombre3 = random.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000
            // si la condition est respecté,
        }

        System.out.println("Nombre 1 = " + nombre1);
        System.out.println("Nombre 2 = : " + nombre2);
        System.out.println("Nombre 3 = " + nombre3);
        System.out.println("tia trouvé  la bonne combinaison le sang, psahtek bg");
        // Affiche les numéros respectant la consigne
    }
}