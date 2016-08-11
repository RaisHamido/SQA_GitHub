import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;




public class Main {

   public static void main(String[] args) throws IOException, InterruptedException {

	  ProcessBuilder pb = new ProcessBuilder("java", "-jar", "TicketMachine.jar");
	  Process p = pb.start(); 
	  
	  BufferedWriter p_in = new BufferedWriter (new OutputStreamWriter(p.getOutputStream()));
	  BufferedReader p_out = new BufferedReader(new InputStreamReader(p.getInputStream()));
	
	  p_in.write("1\n1\n1\n1");
	  p_in.flush();
	  p_in.close();
	  print(p_out);
	  System.out.println("change file");
	  System.out.println("change2 file");
	  
	  
	
   }
   
   public static void print(BufferedReader _BufferedReader) throws IOException{
	   BufferedReader in = _BufferedReader;
		  String s = "";
		  while((s = in.readLine()) != null){
		      System.out.println(s);
		  } 
   }
}
