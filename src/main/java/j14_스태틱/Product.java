package j14_스태틱;
/*
 공유영역

 */

import lombok.Data;

@Data

public class Product {

    private static int autoIncrement = 20220000;//static은 선언하자마자 static메모리에 할당이 됨.

    private int serialNumber;//메모리에 할당이 안됐음
    private String name;//메모리에 할당이 안됐음

     public Product(String name) {
         this.serialNumber = ++autoIncrement;
         this.name = name;
     }

     public static void print() {
         System.out.println(autoIncrement);
        // System.out.println(serialNumber);//serialNumber, name은 메모리에 할당되어야 쓸 수 있다.
      //   Product product = new Product("모니터");//heap에 할당이 됨
         //print()가 실행될 때마다 새 new가 되어 생성자가 실행되어 autoIncrement가 증가한다.
      //  System.out.println(product.getSerialNumber());

         Product product = new Product("아이폰");
         System.out.println(product.add(10,20));
     }

     public int add(int a, int b) {
         return a + b;
     }
}
