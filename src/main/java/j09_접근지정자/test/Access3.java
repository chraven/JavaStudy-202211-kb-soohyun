package j09_접근지정자.test;

public class Access3 {

    private String address;

    private void printAddress() {
        String address = null;
        System.out.println("address: " + this.address);
    }
}
