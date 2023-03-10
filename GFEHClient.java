/*
Demonstrates Polymorphism at a more complex level in
method1() call from class E.:
	When called from class E, output is G1.
	When called from class H, output is H1.
*/

public class GFEHClient{
	public static void main(String[] args){
		G[] elements = {new G(), new F(), new E(), new H()};
		for (int i = 0; i < elements.length; i++){
			System.out.println(elements[i]);
			elements[i].method1();
			elements[i].method2();
			System.out.println();
		}
	}
}