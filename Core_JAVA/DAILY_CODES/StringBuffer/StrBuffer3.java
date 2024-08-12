
class StrBuffer3Demo{
	public static void main(String[]args){
		StringBuffer sb = new StringBuffer(100);            //Initial capacity(Ensure Capacity) [if user know the capacity of String to be added then they can give capacity at initial stage so that time required for compilation of code will reduce because compiler dosen't need to do calculation for capacity Hence it reduces the time]

		sb.append("Sakshi");
		sb.append("Savani");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Prajakta");

		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}
