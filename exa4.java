class parent{
	int a = 10;
	parent(){
	System.out.println("in parent");
}
	}

class child extends parent{
	child(){
	super();
	
	System.out.println("in child "+a);
}
	}

class demo{
	public static void main(String[]args){
		child ch = new child();
		parent p = new parent();
}
	}
