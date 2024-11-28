import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvviatoreSingleThread
{
	public static void main(String[] args) throws FileNotFoundException
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

		Long fineParteNumeri_inizioParteCommedia = System.nanoTime();
		Scanner fileReader = new Scanner(new File("commediamultidimensionale.txt"));

		List<String> parole = new ArrayList<>();
		while(fileReader.hasNext())
		{
			String row = fileReader.nextLine();
			String[] splitted = row.split(" ");
			for(String s : splitted)
				parole.add(s);
		}
		fileReader.close();
		//gli do un file enorme da leggere solo per fargli perdere tempo

		String parolaDaCercare = "parea";
		int count =0;
		for(String s : parole)
			if(s.equals(parolaDaCercare))
				count++;

		System.out.println(parolaDaCercare+" compare "+count+" volte");
		Long fine = System.nanoTime();

		Long tempoTotale = fine-inizio;
		Long tempoParteNumeri = fineParteNumeri_inizioParteCommedia-inizio;
		Long tempoParteCommedia = fine-fineParteNumeri_inizioParteCommedia;

		System.out.println("Tot_____ "+tempoTotale);
		System.out.println("Numeri__ "+tempoParteNumeri);
		System.out.println("Commedia "+tempoParteCommedia);
	}
}
