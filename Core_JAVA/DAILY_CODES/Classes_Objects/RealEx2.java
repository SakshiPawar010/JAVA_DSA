
class HipHop{
	static String hiphopTeacher = "Akshay Sir";
	int studentId = 13;
	String name = "Sakshi";
	void id(){
		System.out.println("Student ID : "  + studentId);
		System.out.println("Name of Student : " + name);
	}
	static void teacher(){
		System.out.println("Name HipHop of Teacher : " + hiphopTeacher);
	}
}

class ImpactAcademy{
	public static void main(String[]args){
		HipHop student1 = new HipHop();
		HipHop student2 = new HipHop();

		student1.id();
		student1.teacher();
	}
}
