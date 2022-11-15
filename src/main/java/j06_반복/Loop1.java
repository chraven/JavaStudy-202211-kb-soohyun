package j06_반복;

public class Loop1 {
    public static void main(String[] args) {

        int n = 10;

        for(int i = 0; i < n; i++){
            System.out.print(i);
            if(i < n - 1){
                System.out.print(", ");

            }

        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(i + 10);
            if(i < n - 1){
                System.out.print(", ");
            }
        }

        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(10 - i);//선생님 답 : System.out.print(n - i)
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(20 - i);//선생님 답 : System.out.print(n - i + 10) 반복 기준을 되도록 바꾸지 않으면서 변수 활용.
            if(i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i = 0, j = n; i < n; i++, j--){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
