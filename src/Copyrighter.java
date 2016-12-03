//Copyright Ryan Nagle, 2016
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;

public class Copyrighter {
	BufferedReader br;
	FileReader fr;
	FileReader fr2;
	FileWriter fw;
	RandomAccessFile f;
	String copyright;
	File folder;
	File copied;
	File[] list;
	
	public static void main(String[] args) {
		Copyrighter cr = new Copyrighter();
		cr.run();		
		}
	
	private void run() {
		// TODO Auto-generated method stub
		folder = new File("src");
		list = folder.listFiles();
		copyright = "//Copyright Ryan Nagle, " + Calendar.getInstance().get(Calendar.YEAR);
		if(folder.exists()) {
			
		for(File i: list) {
			try {
				fr = new FileReader(i);
				fr2 = new FileReader(i);
				br = new BufferedReader(fr);
				fw = new FileWriter(i, true);
				String readLine = br.readLine();
				while(readLine != null) {
					if(readLine.matches("//Copyright Ryan Nagle, [0-9]{4}")) {
						System.out.println("Copyright already present on file: " + i.getName());
						break;
					} else {
						System.out.println("ryan");
						f = new RandomAccessFile(i, "rw");
						BufferedReader br2 = new BufferedReader(fr2);
						String firstLine = br2.readLine();
						//while(firstLine.equals(""))
							//firstLine = br2.readLine();		
						copyright += "\n" + firstLine;
						f.seek(0); // to the beginning
						f.write(copyright.getBytes());
						f.close();
						break;
					}
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

}
