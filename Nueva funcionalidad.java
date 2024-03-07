public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un número:");
        int number = scanner.nextInt();

        if (number == 6) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("Lo siento, no has acertado. El número era 6.");
        }

        scanner.close();
    }
}