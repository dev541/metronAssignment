import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class StringSorting {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int noOfStrings=Integer.parseInt(line);
		
		//Declare a set to contain all strings
		Set<String> s=new TreeSet<String>();
		
		//put all strings into set
		for(int i=noOfStrings;i>0;i--)
		{
			line=br.readLine();
			s.add(line);
		}
		
		//now Set contains all Strings in sorted order
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
