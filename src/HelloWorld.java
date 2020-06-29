
public class HelloWorld {

	public static int length;
	public static boolean endsWith;
	
	public static void main(String[] args) {

		String s = "Welcome to Eclipse";
		String s5 = "Welcome to Eclipse";
		

		char n = s.charAt(1);

		System.out.println(n);

		length = s.length();

		System.out.println(length);

		endsWith = s.endsWith("a");

		System.out.println(endsWith);

		String replace = s.replace("t", "T");

		System.out.println(replace);

		int compareTo = s.compareTo("Welcome to Eclipse");

		System.out.println(compareTo);

		String[] split = s.split(" ");

		for (String s1 : split) {

			System.out.println(s1);
		}

		System.out.println("To CharArray");
		char[] charArray = s.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		System.out.println("Sring reverse using Split Method");

		String[] split1 = s.split("");
		
		for (int j = split1.length-1; j >= 0; j--) {

			System.out.print(split1[j]);
		}

		System.out.println();

		System.out.println("Sring reverse using CharAt Method");

		for(int k=s.length()-1; k>=0; k--) {
			
			System.out.print(s.charAt(k));
		}
		System.out.println();
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s5));
	
	/*While - infinity loop*/
	
//	int sum=0;
//	int count=5;
//	while(count>1)
//	{
//	    sum=sum+count;
//	    count=count+2;
//
//	System.out.println(sum);
//	sum++;
	}
	}
