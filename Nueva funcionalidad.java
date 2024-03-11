public class Main {
    public static void main(String[] args) {
        Scanner meow = new Scanner(System.in);

        System.out.println("Por favor, introduce un número:");
        int number = meow.nextInt();

        if (number == 6) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("No has acertado. El número era 6.");
        }

        meow.close();
    }
}
//cambio