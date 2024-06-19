import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] mass = new int[10];
        int sum = 0;
        int average = 0;
        int peopleMass = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = new Random().nextInt(100 - 40 + 1) + 40;
        }
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
            if (mass[i] >= 60 && mass[i] <= 80){
                peopleMass++;
            }
        }
        average = sum / mass.length;
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("\n" + average + " " + peopleMass) ;


    }
}
