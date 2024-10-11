class Demo{
	public static void main(String[]args){
		Codex.fun();
	}
}
class Codex{
	void fun(){
		System.out.println();
	}
}

O/p:-	error: non-static method fun() cannot be referenced from a static context
                Codex.fun();
                     ^