class Demo{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
		char ch='A';
		int a=1;
			for(int j=4;j>=1;j--){
				if(i<j){
					System.out.print("  ");
				}else if(i%2==1){
					System.out.print(ch+" ");
					ch++;
				}else{
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();

		}
	}
}

O/p:-         A
    	    1 2
  	  A B C
	1 2 3 4