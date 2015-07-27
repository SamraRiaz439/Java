import java.io.*;
public class Student implements Serializable{
	String name;
	int rollNo;
	public Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	public static void main(String... args){
		Student s=new Student("Mukul",18);
		try{
			FileOutputStream fs=new FileOutputStream("stu.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(s);
			os.close();
			fs.close();
			System.out.println("Data has been saved as stu.ser");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	
}