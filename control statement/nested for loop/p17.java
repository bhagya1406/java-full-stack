class Demo{
	public static void main(String[]args){
	int a=1;
		for(int i = 1; i<=4;i++){
			for(int j = 1; j<=i;j++){
				System.out.print(a+" ");
			}
			System.out.println();
			a++;
		}
	}
}

O/p:-   1
	2 2
	3 3 3
	4 4 4 4
