package FirstLastNameProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NamesApplication {
	
	public static void main(String[] args) {
		
		ArrayList<String> firstNameList = new ArrayList<String>();
		ArrayList<String> secondNameList = new ArrayList<String>();
		ArrayList<String> fullNameList = new ArrayList<String>();
		
		try {
			FileReader firstNamesFile = new FileReader("firstName.txt");
			BufferedReader firstNameReader = new BufferedReader(firstNamesFile);
			
			FileReader lastNamesFile = new FileReader("lastName.txt");
			BufferedReader secondNameReader = new BufferedReader(lastNamesFile);
			
			String firstName;		
			String secondName;
			while((secondName = secondNameReader.readLine()) != null &&
			(firstName = firstNameReader.readLine()) != null) {
				
				firstNameList.add(firstName);
				secondNameList.add(secondName);
				fullNameList.add(firstName +" "+secondName);
				
			}
			
			firstNameReader.close();
			secondNameReader.close();
			
			
			FileWriter firstFullNameFile = new FileWriter("fullName.txt");
			BufferedWriter fullNameWriter = new BufferedWriter(firstFullNameFile);
			
			for(int i=0; i<fullNameList.size(); i++) {
				fullNameWriter.write(fullNameList.get(i) + "\n");
			}
			
			System.out.println("Full Name File Generated");
			fullNameWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
	
	

