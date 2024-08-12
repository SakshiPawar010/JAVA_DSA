
class Outer{
	int x = 10;
	class Inner{			//Inner Class of Outer Class
		void m1(){		//Method of Inner Class
			System.out.println("Outer-Inner-Method.");
		}
	}
	void m2(){			//Method of Outer class
		System.out.println("Outer-Method.");
	}
}

class Client{
	public static void main(String [] args){
		Outer obj1 = new Outer();
		obj1.m2();

		Outer.Inner obj2 = obj1.new Inner();		//Object of Inner class
		obj2.m1();
	}
}
