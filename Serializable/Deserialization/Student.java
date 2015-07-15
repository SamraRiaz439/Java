import java.io.*;
public class Student implements Serializable{
	String name;
	int rollNo;
	public Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	public static void main(String... args){
	
		try{
			FileInputStream fs=new FileInputStream("stu.ser");
			ObjectInputStream os=new ObjectInputStream(fs);
			Student s=(Student)os.readObject();
			os.close();
			fs.close();
			System.out.println("Data has been restored ");
			System.out.println("Name is"+ s.name);
			System.out.println("Roll no is " +s.rollNo);
			
			
			System.out.println();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	
}