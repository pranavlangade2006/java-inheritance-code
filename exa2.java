class one{
	int a = 10;
	void property(){
	System.out.println("100 arc");
}
	}

class two extends one{
	void fun(){
	System.out.println(a);
	}
}

class demo{
	public static void main(String[]args){
		two t = new two();
			t.fun();
			t.property();

			
}
	}
