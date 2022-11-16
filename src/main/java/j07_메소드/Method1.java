package j07_메소드;

public class Method1 {

    public static void method1(){//public static은 무조건 쓴다고 생각. ()비었음 = 매개변수 없음. void: 리턴값도 없다.
        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    public static void method2(int a){
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a: " + a);
        System.out.println();
    }

    public static int method3(int a, int b){
        System.out.println("메소드3 호출");
        System.out.println("매개변수 a: " + a);
        System.out.println("매개변수 b: " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;
    }

    public static int max(int a, int b){//int인 값을 무조건 return을 해야 함. 어느 조건이든. if만 쓸 순 없음.
        int result = 0;
        if(a < b) {
            result = b; //b가 클 때 b 출력
        } else {
            result = a; //a가 클 때 a 출력 . return 만나면 method 탈출함. 끝.
        }
            return result;
    }

    public static void main(String[] args) {
        method1();//호출 method call
        System.out.println("메소드1 호출 후 출력");
        method2(10);//위의 method2로 올라가 int a에 10 대입, 위의 메소드 코드 진행됨.
        int result1 = method3(3000, 7000);
        System.out.println("result1: " + result1);
    }
}
