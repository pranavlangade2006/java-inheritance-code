class parent{
	int a = 10;
}

class child extends parent{
	int a = 50;
	void fun(){
	System.out.println("in child :"+this.a);
	System.out.println("in child:"+super.a);

}
	}
class demo{
	public static void main(String[]args){
		child ch = new child();
			ch.fun();
	}
}
