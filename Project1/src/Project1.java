import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Project1 {

	public static void main(String[] args) {

		File file = new File("input.txt");
		String[] lines = new String[100];
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffReader = new BufferedReader(reader);
			int x = 0;
			String s;
			while ((s = buffReader.readLine()) != null) {
				lines[x] = s;
				x++;
			}
			buffReader.close();
		} catch (IOException e) {
			// handle exception
		}

		String[] stringArray = new String[100];
		String OPERATORS = ",";
		int numberOfStrings = 0;

		for (String line : lines) {
			if(line!=null){
			StringTokenizer tokens = new StringTokenizer(line, OPERATORS, false);
			while (tokens.hasMoreTokens()) {
				String token = tokens.nextToken();
				stringArray[numberOfStrings] = token;
				numberOfStrings = numberOfStrings + 1;
			}
			}
		}

		new DateGUI();
		for (int i = 0; i < numberOfStrings; i++) {
			DateGUI.unsortedElements.append(stringArray[i] + "\n");//Adding them.
		}

		selectionSort(stringArray, numberOfStrings);

		for (int i = 0; i < numberOfStrings; i++) {
			Date212 date = new Date212(stringArray[i]);
			DateGUI.sortedElements.append(date.toString() + "\n");//Adding them.
		}

	}

	//How we sort.
	//We're essentially going to assume the first string is the smallest.
	//Then we're going to compare one by one basically.
	public static void selectionSort(String[] theArray, int numberOfStrings) {
		for (int i = 0; i < numberOfStrings - 1; i++) {
			int min = i;
			for (int j = i + 1; j < numberOfStrings; j++) 
			{
				if (theArray[j].compareTo(theArray[min]) < 0)
				{
					min = j;
				}
			}
			if (min != i) //Smaller then the min? Swap!
			{
				String temporary = theArray[i];
				theArray[i] = theArray[min];
				theArray[min] = temporary;
			}
		}

	}
}
