import java.util.function.Function;
public class A{
	static Function <Integer,Integer>f=i->i*i;
	
	public static void main(String[] args){
		System.out.print("The Square of 16: "+f.apply(16));
		
	}
}