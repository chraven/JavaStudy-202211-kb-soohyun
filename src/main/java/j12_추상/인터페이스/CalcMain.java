package j12_추상.인터페이스;

public class CalcMain {

    public static void main(String[] args) {
        int[] taxPay = {2000000,2500000,2600000,2700000};
        int[] salaryPay = {1000000,1000000,1000000,1000000,};

        int result1 = 0;
        int result2 = 0;


        Calculator calculator = new Tax();//업캐스팅 Tax가 implements를 했기 때문에 대입할 수 있다.
        result1 = calculator.calc(taxPay);

        if(result1 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else {
            System.out.println("result1 => " + result1);
        }


        calculator = new Salary();
        result2 = calculator.calc(salaryPay);
        if(result2 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else {
            System.out.println("result2 => " + result2);
        }



        // tax.calc(new int[] {2000000,2500000,2600000,2700000});//배열을 그대로 쓰면 오류. 배열이라고 알려주어야

       }
}


