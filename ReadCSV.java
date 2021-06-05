import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	public static void main(String[] args) {
		String line = "";
		String splitBy = ",";
		try {
//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("/Users/vickyli/Documents/feedback.csv"));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] data = line.split(splitBy); // use comma as separator
				System.out.println("Loading speed= " + data[1] + ", Accuracy=" + data[2]
						+ ", Enough options=" + data[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
