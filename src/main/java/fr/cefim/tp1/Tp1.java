package fr.cefim.tp1;

import java.util.Scanner;

public class Tp1 {
    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        exercice1_1();
        exercice1_2();
        exercice2_1();
        exercice2_2();
        exercice3_1();
        exercice4_1();
        exercice4_2();

        scanner.close();
    }

    //Méthode pour l'exercice 1.1//
    public static void exercice1_1() {
        String prenom;
        String nom;
        int age;

        System.out.print("Prénom : ");
        prenom = scanner.next();

        System.out.print("Nom : ");
        nom = scanner.next();

        System.out.print("Âge : ");
        age = scanner.nextInt();

        System.out.println("Exercice 1.1 : Bonjour " + prenom + " " + nom + ", " + age + " ans !");
    }


    //Méthode pour l'exercice 1.2//
    public static void exercice1_2() {
        int x;
        int y;
        int temp;

        System.out.print("x : ");
        x = scanner.nextInt();

        System.out.print("y : ");
        y = scanner.nextInt();

        System.out.println("Exercice 1.2 : x=" + x + ", y=" + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("Les valeurs sont permutées, x vaut " + x + ", y vaut " + y);
    }

    //Méthode pour l'exercice 2.1//
    public static void exercice2_1() {
        String mot1;
        String mot2;

        System.out.print("Premier mot : ");
        mot1 = scanner.next();

        System.out.print("Deuxième mot : ");
        mot2 = scanner.next();

        if (mot1.length() > mot2.length()) {
            System.out.println("Le premier mot " + mot1 + "  est plus long.");
        } else if (mot1.length() < mot2.length()) {
            System.out.println("Le deuxième mot " + mot2 + " est plus long.");
        } else {
            System.out.println("Les deux mots ont la même longueur.");
        }
    }

    //Méthode pour l'exercice 2.2//
    public static void exercice2_2() {
        int annee;

        System.out.print("Saisir une année : ");
        annee = scanner.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println("L’année " + annee + " est bissextile");
        } else {
            System.out.println("L’année " + annee + " n’est pas bissextile");
        }
    }

    //Méthode pour l'exercice 3.1//
    public static void exercice3_1() {
        int nombre;
        int max = -1;
        int min = 101;
        int positionMax = -1;
        int positionMin = -1;

        for (int i = 1; i <= 10; i++) {
            nombre = (int) (Math.random() * 101);
            System.out.println("Le nombre " + i + " vaut " + nombre);

            if (nombre > max) {
                max = nombre;
                positionMax = i;
            }

            if (nombre < min) {
                min = nombre;
                positionMin = i;
            }
        }

        System.out.println("Le maximum vaut " + max + " (numéro " + positionMax + ")");
        System.out.println("Le minimum vaut " + min + " (numéro " + positionMin + ")");
    }

    //Méthode pour l'exercice 4.1//
    private static void saisirNombre() {
        System.out.print("Saisir un nombre entier entre 0 et 100 : ");
    }

    public static void exercice4_1() {
        int nombre;

        nombre = (int) (Math.random() * 101);

        int n;
        int compteur = 1;

        saisirNombre();
        n = scanner.nextInt();


        while (n != nombre) {
            if (Math.abs(n - nombre) > 20) {
                System.out.println("C'est froid!");
                compteur++;
                saisirNombre();
                n = scanner.nextInt();
            } else if (Math.abs(n - nombre) <= 20 && Math.abs(n - nombre) >= 6) {
                System.out.println("C'est tiède!");
                compteur++;
                saisirNombre();
                n = scanner.nextInt();
            } else if (Math.abs(n - nombre) <= 5 && Math.abs(n - nombre) >= 1) {
                System.out.println("C'est chaud!");
                compteur++;
                saisirNombre();
                n = scanner.nextInt();
            }
        }
        System.out.println("Gagné! Le nombre était " + nombre + "! Vous avez trouvé en " + compteur + " essais.");
    }

    //Méthode pour l'exercice 4.2//
    public static void exercice4_2() {
        int nombre;
        nombre = (int) (Math.random() * 101);
        int n;
        int compteur = 0;
        do {
            System.out.print("Saisir un nombre entier entre 0 et 100 : ");
            n = scanner.nextInt();
            compteur++;

            //Calcul de la différence entre le nombre saisi et le nombre à deviner
            int diff = Math.abs(n - nombre);

            if (diff > 20) {
                System.out.println("C'est froid!");
            } else if (diff <= 20 && diff >= 6) {
                System.out.println("C'est tiède!");
            } else if (diff <= 5 && diff >= 1) {
                System.out.println("C'est chaud!");
            }
        } while (n != nombre);
        System.out.println("Gagné! Le nombre était " + nombre + "! Vous avez trouvé en " + compteur + " essais.");
    }
}

