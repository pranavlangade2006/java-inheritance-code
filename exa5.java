class parent{
	int a= 10;
	}
class child extends parent{
	int a = 50;
	void fun(){
	System.out.println("in child "+a);
}
	}

class demo{
	public static void main(String[]args){
	child c = new child();
		c.fun();

}
	}

		