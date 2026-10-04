class parent{
	parent(){
		System.out.println("in parent");
}
	}


class child{
	child(){
		System.out.println("in child");
}
	}

class demo{
	public static void main(String[]args){
		child c = new child();
		parent p = new parent();
}
	}
