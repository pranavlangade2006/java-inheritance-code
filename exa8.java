class parent{
	int a;
	parent(int a){
	this.a = a;
}
	
	void display(){
	System.out.println("parent:"+a);
	}
}

class child extends parent{
	int b ;
	child (int data , int b){
	super(data);
	this.b = b;
	}
	void fun(){
	System.out.println("int fun:"+" "+b);
}
	}

class demo{
	public static void main(String[]args){
		child c = new child(10 ,20);
		c.fun();
		parent p = new parent(50);
		p.display();
}
	}



	
