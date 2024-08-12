
class IAF{
	String cds = "General Anil Chauhan";
	int noOfExams = 3;

	void examInfo(){
		String name = "AFCAT";

		System.out.println("Chief of Defence Staff : " + cds);
		System.out.println("Number of exams are : " + noOfExams);
		System.out.println("Name of Exam : " + name);
	}
}

class India{
	public static void main(String [] args){
		IAF obj = new IAF();

		obj.examInfo();
	}
}
