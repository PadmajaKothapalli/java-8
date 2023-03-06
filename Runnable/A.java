class A{
	public static void main(String[] args){
		String name="Pavithra";
		Runnable r1=()-> System.out.println(name);
		r1.run();
		
		String ename = name.toUpperCase();
		Runnable r2=()-> System.out.println(ename);
		r2.run();
	}
}