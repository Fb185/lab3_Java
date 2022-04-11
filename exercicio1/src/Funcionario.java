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
// import java.util.Timer;
// import java.util.TimerTask;

// public class funcionario extends TimerTask {
//     Timer timer = new Timer("Timer");

//     TimerTask trabalhar = new TimerTask() {

//         public run() {
//             System.out.println(nome + " - Comecei");
//             while (pecasProduzidas < TOTAL_PECAS) {
//                 try {

//                     System.out.println(nome + ": " + ++pecasProduzidas);
//                 } catch (InterruptedException ex) {
//                     System.out.println("ex");
//                 }
//             }
//             if (pecasProduzidas == TOTAL_PECAS) {

//                 System.out.println(nome + " - terminei.");
//                 trabalhar.cancel();
//                 timer.cancel();
//             }
//         }
//     };

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

//         timer.scheduleAtFixedRate(trabalhar(), 1, 1);
//         System.out.println("Main Termindado");
//     }
// }
import java.util.TimerTask;
import java.util.Timer;

public class Funcionario extends Timer {

    Timer timer = new timer();
    int maximo = 10;
    int a;
    int delay = 2000;

    TimerTask trabalhar = new TimerTask() {
        @Override
        public void run() {
            System.out.println("Codigo que vai rodar em loop.");
            a++;
            if (a == maximo) {
                System.out.println("Este if serve para parar o timr");
                trabalhar.cancel();
                timer.cancel();
            }
        }
    };

    Funcionario() {
        // public void inicio() {
        timer.scheduleAtFixedRate(trabalhar, this.delay, this.delay);
        // }
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

    }

}
