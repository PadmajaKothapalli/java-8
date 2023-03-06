import java.util.function.Predicate;
public class A{
	static Predicate<Integer> p=i->i%2==0;
	
	public static void main(String[] args){
		System.out.print(p.test(4));
	}
}