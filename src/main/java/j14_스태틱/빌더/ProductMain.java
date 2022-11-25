package j14_스태틱.빌더;


public class ProductMain {

    public static void main(String[] args) {


        Product product = Product.builder()
                .productCode(20220001)
                .productName("노트북")
                .price(1_000_000)
                .stock(1)
                .build();

        System.out.println(product);
    }
}
