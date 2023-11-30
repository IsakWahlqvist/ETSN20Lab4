import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	
	
	public static void main(String args[]) {
		
		// Check for the correct amount of arguments
		if(args.length != 2) {

			// Print the error and correct usage
			System.out.println("Unexpected amount of arguments");
			System.out.println("Default usage is SearchFile [word] [file]");

			return;
		}
		
		// Get the word to find and the file from arguments
		String wordToFind = args[0];
		String file = args[1];

		// Try to read the file
		try {
			// Create a reader
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;

			// Keep track of the line number
			int lineCount = 0;

			// Read each line
			while((line = reader.readLine()) != null) {
				// Increment the line number
				lineCount++;

				// Check if the line contains the word
				if(line.contains(wordToFind)) {
					// Print the line number and the line
					System.out.println(lineCount + ": " + line);
				}
			}

			// Close the reader
			reader.close();
		} catch(Exception e) {
			System.out.println("Error reading file");
		}
		
	}

}
