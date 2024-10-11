class Demo{
	public static void main(String[]args){
		int sum=add(10,20);
		int sub=sub(10,20);
		System.out.println("addition is " + sum);
		System.out.println("substraction is " + sub);

	}
	static int add(int a, int b){
		int sum = a+b;
		return a+b;
	}
	static int sub(int a, int b){
		int sub = a-b;
		return a-b;
	}
}

O/p:-	addition is 30
	substraction is -10