public class Main {

    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 0;
            int c = 5 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}