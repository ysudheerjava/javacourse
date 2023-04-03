public class StaticConstructorDemo {
	static String name;
	static int age;

	StaticConstructorDemo() {
		name = "Krishna";
		age = 25;
	}

	public static void main(String args[]) {
		new StaticConstructorDemo();
		System.out.println(StaticConstructorDemo.name);
		System.out.println(StaticConstructorDemo.age);

		StaticConstructorDemo s = new StaticConstructorDemo();
		s.name = "Ram";
		System.out.println(StaticConstructorDemo.name);

		int a = '1';
		System.out.println(a);
		char b = (char) a;
		System.out.println(b);

		System.out.println("XXXXXXXXXXXXXX");
		System.out.println('b' + 3);

		System.out.println("YYYYYYYYYYYYYYYY");

		int aa = 1;
		System.out.println(aa);
		System.out.println('0');
		System.out.println(aa + '0');
		char bb = (char) (aa + '0');
		System.out.println("ZZZZZZZZZZZZZZ");
		System.out.println(bb);
	}
}