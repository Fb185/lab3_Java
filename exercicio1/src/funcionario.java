//exercicio 1
public class funcionario extends Thread {
    public void run() {
        trabalhar();
    }

    public void trabalhar() {
        System.out.println(nome + " - Comecei");
        while (pecasProduzidas < TOTAL_PECAS) {
            try {

                Thread.sleep(delay);
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

        manuel.start();
        pedro.start();
        System.out.println("Main Termindado");
    }
}
