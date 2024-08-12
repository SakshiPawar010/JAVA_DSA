
class Forces{
	Forces(){
		System.out.println("Indian Armed Forces");
	}
}

class Army extends Forces{
	Army(){
	System.out.println("Indian Army");
	}
}

class India{
	public static void main(String[]args){
		Army obj1 = new Army();
	}
}
