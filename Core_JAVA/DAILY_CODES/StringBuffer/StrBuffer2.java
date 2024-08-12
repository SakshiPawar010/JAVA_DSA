/* (Current capacity + 1) * 2
*/
class StrBuffer2Demo{
	public static void main (String[]args){
		StringBuffer sb  = new StringBuffer();

		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Sakshi");
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append(" Pawar");
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append(" Khindwadi Satara");
		System.out.println(sb.capacity());
		System.out.println(sb);

	}
}
