class Demo{
	public static void main(String[]args){
	char ch='A';
		for(int i=1;i<=4;i++){
			for(int j=4;j>=1;j--){
				if(i<j){
					System.out.print("  ");
				}else{
					System.out.print(ch+" ");
				}
			}
			System.out.println();
			ch++;	
		}
	}
}

O/p:-         A
    	    B B
  	  C C C
	D D D D