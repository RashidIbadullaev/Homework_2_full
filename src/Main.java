public class Main {
    public static void main(String[] args) {

        System.out.println(weather(21, 15.3));
        System.out.println(weather(18, 23.1));
        System.out.println(weather(50, 20.7));
        System.out.println(weather(17, 35.6));
        System.out.println(weather(21, 35.2));

    }

    public static String weather(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Mozhno idti guliat";

        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Mozhno idti guliat";

        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Mozhno idti guliat";

        } else {
            return "Ostavaites doma";
        }
    }

}