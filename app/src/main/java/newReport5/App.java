/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package newReport5;

public class App {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException発生");
            System.out.println(e.getMessage());
        }

    }
}
