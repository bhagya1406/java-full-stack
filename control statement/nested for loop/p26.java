class Demo{
	public static void main(String[]args){
	char ch='A';
	int a=1;
		for(int i=1;i<=4;i++){
			for(int j=4;j>=1;j--){
				if(i<j){
					System.out.print("  ");
				}else if(i%2==1){
					System.out.print(ch+" ");
				}else{
					System.out.print(a+" ");
				}
			}
			System.out.println();
			a++;
			ch++;
		}
	}
}

O/p:-         A
    	    2 2
  	  C C C
	4 4 4 4