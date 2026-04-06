import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

final class Student implements Serializable {
	
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}

public class FileHandlingTest {

	public static void main1(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("E:/Pritish_Pawar_FBS_work/student.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			
			ArrayList<Student> studArray = new ArrayList<>();
			studArray.add(new Student(1, "onk"));
			studArray.add(new Student(2, "sham"));
			studArray.add(new Student(3, "gian"));
			
			
			oos.writeObject(studArray);
			System.out.println("Successfully Writen");
			
			oos.close();
			dos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
	    try {
	        FileInputStream fis = new FileInputStream("E:/Pritish_Pawar_FBS_work/student.txt");
	        ObjectInputStream ois = new ObjectInputStream(fis);

	        ArrayList array = (ArrayList) ois.readObject();
	        
	        for(int i=0; i<array.size(); i++) {
	        	System.out.println(array.get(i));
	        }

	        ois.close();
	        fis.close();

	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}

}
