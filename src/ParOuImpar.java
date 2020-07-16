
public class ParOuImpar {

	public static void main(String[] args) {
		int x = 0;
		
		while (x <= 100) {
			if(x % 2 == 0) {
				System.out.println(Integer.toString(x)+ "-P");
			}else {
				System.out.println(Integer.toString(x)+ "-I");
			}
			x = x + 1;
		}
	}

}
