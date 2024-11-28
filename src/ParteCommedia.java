import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParteCommedia extends Thread
{
	@Override
	public void run()
	{
		Long inizio = System.nanoTime();
		Scanner fileReader = null;
		try
		{
			fileReader = new Scanner(new File("commediamultidimensionale.txt"));
		} catch (FileNotFoundException e)
		{
			throw new RuntimeException(e);
		}

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

		System.out.println("Commedia "+tempoTotale);
	}
}
