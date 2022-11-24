package j14_스태틱;

import j07_메소드.Method1;

public class ProductMain {

    public void show() {
        System.out.println("메인 메소드에서 호출");
    }

    public static void main(String[] args) {

        Product product1 = new Product("아이폰14");
        Product product2 = new Product("아이폰14_Mini");//생성자가 호출됨. static으로 공유되는 autoIncrement가 증가된다.

        System.out.println(product1);
        System.out.println(product2);//serialNumber가 자동으로 1씩 증가해서 출력됨.


        product1.print();
        product2.print();
        Product.print();//heap에 할당될 필요없이 바로 접근이 가능하다.

        ProductMain pm = new ProductMain();

        pm.show();//메모리를 생성해야 일반메소드가 접근 가능하다. static인 경우엔 메모리를 생성할 필요가 없다.

        Method1.main(null);//Method1클래스의 메인메소드를 호출. static메소드는 public이면 어디서든 접근 가능하다.
        Method1.method1();
    }
}
