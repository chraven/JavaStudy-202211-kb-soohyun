package j06_반복;

public class Loop2 {
    public static void main(String[] args) {

        /*
            [2단]
            2 X 1 = 2
            2 X 2 = 4
            2 X 3 = 6
            ...
            2 X 9 = 18
         */
        int dan = 3;
        System.out.println("[" + dan + "단]");
        for(int i = 0; i < 9; i++){
            int num = i + 1;
            System.out.println(dan + " X " + num + " = " + (dan * num));


        }
    //이중반복
        System.out.println();
        for(dan = 0; dan < 9; dan++) {//바깥 반복
            int num2 = dan + 1;
            System.out.println("[" + num2 + "단]");
            for(int i = 0; i < 9; i++){
                int num = i + 1;
                System.out.println(num2 + " X " + num + " = " + (num2 * num));
                }
        }

       /* 선생님 답 2단부터 시작함
       for(int i = 0l i < 8l i++){
            int dan i + 2;
            System.out.println("[" + dan + "단]");
            for
        }for(int j = 0; j < 9; j++){
        int num j + 1;
        System.out.println(dan +" x " + num + " = " + (dan * num));
        */



        }
    }

