package j10_배열;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];//new : 동적 메모리에 5개의 공간을 할당한다. 한 공간당 4byte. 얘들의 주소를 numbers에 담음.

        int number1 = 1;
        int number2 = 1;
        int number3 = 1;
        int number4 = 1;
        int number5 = 1;



        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);



    }
}
