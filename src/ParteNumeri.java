import java.util.Scanner;

public class ParteNumeri extends Thread
{
	@Override
	public void run()
	{
		Long inizio = System.nanoTime();

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Dai numero 1");
		int numero1 = Integer.parseInt(keyboard.nextLine());
		System.out.println("Dai numero 2");
		int numero2 = Integer.parseInt(keyboard.nextLine());

		int somma = numero1 + numero2;

		System.out.println("La somma è " + somma);

		keyboard.close();

		Long fineParteNumeri = System.nanoTime();
		System.out.println("Numeri__ "+(fineParteNumeri-inizio));
	}
}
