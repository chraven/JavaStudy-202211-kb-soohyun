package j19_익명클래스;

public class CalcMain {// 익명클래스는 이름이 없다.

	public static void main(String[] args) {

		Calculator c = new Calculator() {

			@Override
			public int calc(int x, int y) {// 오버라이드 했을 때 변수명은 바꿀 수 있다. 자료형과 메소드이름은 안됨.
				return x + y;
			}

		};

		Calculator c1 = (x, y) -> x + y; // 화살표 다음이 리턴.
		// 람다

//			Calculator c1 = (int x, int y) -> {//클래스의 정의(오버라이드)와 생성(new). 근데 정의만 있음. 화살표는 new Calculator를 생략. 
//		Calc()안에 자료형이 있으므로 생략. return과 중괄호도 생략 가능. 중괄호{}; 쓰면 return을 꼭 써야 둘 사이에 다른 실행문 출력코드 등이 있을 수 있다.
//		System.out.println("1")		
//		return x + y;
//				};//람다를 쓰려면 인터페이스 안에 (추상)메소드가 하나만 있어야.(@FunctionalInterface. 인터페이스에 추가함) 람다는 인터페이스여야.

		CalculatorSub cs = (x) -> x * x; // 매개변수 x로 하나면 소괄호도 생략 가능: (x)를 x로.

		System.out.println(cs.calc(10));
		System.out.println(cs.a());// CalculatorSub에서의 10을 그냥 리턴함.

		Calculator c3 = new Calculator() {// 클래스 안 만들고 인터페이스만 만들었음. Calculator의 주소값 들어감(heap메모리의 주소값 )
			// 임시로 여기 안에서만 한번만 오버라이드. 오버라이드가 원래 따로 (인터페이스를 상속받은)클래스에 있어야 하는데 여기에 임시로 calc()
			// 구현함.
			// 공간 활용을 줄이기 위해서. 한번만 쓰고 이 공간은 버려지니까. 여기에 생성한 new Calculaotor는 다시 생성해서 또 오버라이드를
			// 해야 여기든
			// 다른 클래스에든 다시 쓸 수 있다.

			@Override
			public int calc(int a, int b) {
				System.out.println("덧셈");
				return a + b;
			}

		};

		int r1 = c1.calc(10, 20);
		System.out.println(r1);

		Calculator c2 = new Addition();// 클래스를 만들어 인터페이스를 implements해서 Calculator를 구현. 재사용을 하려면 이렇게 해야 함.

		int r2 = c2.calc(20, 30);
		System.out.println(r2);

		int r3 = c3.calc(30, 40);
		System.out.println(r3);
	}

}
