class parent{
	int a=10;
}

class child extends parent{
	void fun(){
	
	System.out.println(a);
}
	}

class demo{
public static void main(String[]args){
	child ch = new child();
		ch.fun();
	}
}