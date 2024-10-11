class Demo{
	public static void main(String[]args){
		int sum = Arithmetic.add(10,20);
		int sub = Arithmetic.sub(10,20);
			System.out.println(sum);
			System.out.println(sub);
	}
}
class Arithmetic{
	static int add(int a, int b){
		int sum=a+b;
		return sum;
	}
	static int sub(int a, int b){
		int sub=a-b;
		return sub;
	}
}

O/p:-	30
	-10