import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner to enter a path to create an arboritory
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a path :");
		String str = new String (sc.nextLine());
		Path dir = Paths.get(str);
		boolean bool =Files.exists(dir);
		if(bool==true){
			System.out.println("The directory already exists");
		}else{
			try {
				Path fold =Files.createDirectories(dir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//Suggest to create 2 levels of sub folders
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Do you want to create 2 new sub folders ? ");
		String strFold = new String (sc2.nextLine());
		if (strFold.equals("yes")){
			System.out.println("Ok");
		}
		else {
			System.out.println("Bye");
		}
}
}


