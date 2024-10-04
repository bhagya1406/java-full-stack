class Demo{
	public static void main(String[]args){
		boolean a =true;
		switch(a){
			case 10 :
				System.out.println("case 1");
			default :
				System.out.println("default");
			}
	}
}

O/p:- error: selector type boolean is not allowed
                switch(a){
                      ^
      error: incompatible types: int cannot be converted to boolean
                        case 10 :
                             ^