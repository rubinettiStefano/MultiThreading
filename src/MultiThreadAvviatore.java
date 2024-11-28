public class MultiThreadAvviatore
{
	public static void main(String[] args)
	{
		Thread numeri = new ParteNumeri();
		Thread commedia = new ParteCommedia();

		Long inizio = System.nanoTime();
		numeri.start();
		commedia.start();
		Long fine = System.nanoTime();
		System.out.println("Tot_____ "+(fine-inizio));

	}
}
