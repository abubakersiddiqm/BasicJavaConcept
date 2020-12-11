package basicjavapgm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileandReadFile {

	public static void main(String[] args) throws IOException {
		// File path
		File file = new File("./files/newfile.txt");
		// Create new file
		file.createNewFile();
		// file to write
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Abubaker siddiq");
		bw.newLine();
		bw.write("new files");
		bw.flush();

		// read file
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String x;
		while ((x = br.readLine())!= null) {

			System.out.println(x);
		}
		bw.close();
		br.close();
	}
}
