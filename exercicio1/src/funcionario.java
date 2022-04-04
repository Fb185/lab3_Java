// uncomment the exercise you want to run

//exercicio 1
// public class funcionario extends Thread {
//     public void run() {
//         trabalhar();
//     }

//     public void trabalhar() {
//         System.out.println(nome + " - Comecei");
//         while (pecasProduzidas < TOTAL_PECAS) {
//             try {

//                 Thread.sleep(delay);
//                 System.out.println(nome + ": " + ++pecasProduzidas);
//             } catch (InterruptedException ex) {
//                 System.out.println("ex");
//             }
//         }
//         System.out.println(nome + " - terminei.");
//     }

//     String nome;
//     int delay;
//     int pecasProduzidas = 0;
//     static int TOTAL_PECAS = 10;

//     // constructor
//     public funcionario(String nome, int delay) {
//         this.nome = nome;
//         this.delay = delay;
//     }

//     public static void main(String[] args) {
//         funcionario manuel = new funcionario("Manuel", 3);
//         funcionario pedro = new funcionario("\tPedro", 5);

//         manuel.start();
//         pedro.start();
//         System.out.println("Main Termindado");
//     }
// }

//exercicio 2
// public class funcionario implements Runnable {
//     public void run() {
//         trabalhar();
//     }

//     public void trabalhar() {
//         System.out.println(nome + " - Comecei");
//         while (pecasProduzidas < TOTAL_PECAS) {
//             try {

//                 Thread.sleep(delay);
//                 System.out.println(nome + ": " + ++pecasProduzidas);
//             } catch (InterruptedException ex) {
//                 System.out.println("ex");
//             }
//         }
//         System.out.println(nome + " - terminei.");
//     }

//     String nome;
//     int delay;
//     int pecasProduzidas = 0;
//     static int TOTAL_PECAS = 10;

//     // constructor
//     public funcionario(String nome, int delay) {
//         this.nome = nome;
//         this.delay = delay;
//     }

//     public static void main(String[] args) {
//         funcionario manuel = new funcionario("Manuel", 3);
//         funcionario pedro = new funcionario("\tPedro", 5);

//         Thread manuelthread = new Thread(manuel);
//         Thread pedrothread = new Thread(pedro);
//         manuelthread.start();
//         pedrothread.start();
//         System.out.println("Main Termindado");
//     }
// }

// exercicio 3
import java.util.Timer;

public class funcionario implements Runnable {
    public void trabalhar() {
        System.out.println(nome + " - Comecei");
        while (pecasProduzidas < TOTAL_PECAS) {
            try {

                System.out.println(nome + ": " + ++pecasProduzidas);
            } catch (InterruptedException ex) {
                System.out.println("ex");
            }
        }
        System.out.println(nome + " - terminei.");
    }

    String nome;
    int delay;
    int pecasProduzidas = 0;
    static int TOTAL_PECAS = 10;

    // constructor
    public funcionario(String nome, int delay) {
        this.nome = nome;
        this.delay = delay;
    }

    public static void main(String[] args) {
        funcionario manuel = new funcionario("Manuel", 3);
        funcionario pedro = new funcionario("\tPedro", 5);

        System.out.println("Main Termindado");
    }
}
