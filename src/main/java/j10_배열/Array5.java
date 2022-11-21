package j10_배열;

public class Array5 {
    //선생님 풀이
    public static int getMinNumber(int num1, int num2) {
        return num1 < num2 ? num1 : num2;//num1이 작다면 num1을 return, 아니라면 num2을 return
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {1, 8, 9, 16, 17};
        int[] nums2 = new int[] {2, 7, 10, 15, 18};
        int[] nums3 = new int[] {3, 6, 11, 14, 19};
        int[] nums4 = new int[] {4, 5, 12, 13, 20};

        int[] resultArray = new int[5];
       // 배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.

        for(int i = 0; i < nums1.length; i++) {
            resultArray[i] = getMinNumber(getMinNumber(nums1[i], nums2[i]), getMinNumber(nums3[i], nums4[i]));
            //두 개 중에 작은 거 & 두 개 중에 작은 거의 최소값(작은 거).
            System.out.println(resultArray[i]);
        }
        //힌트
        int a = 10;
        int b = 5;
        int c = 7;

        int min = a;

        if(a < b) {
            min = a;

        }else {
            b = min;
        }

        if(c < min) {
            min = c;

        }
        //System.out.println("min: " + min);

        //======= 내 풀이 ===========


//        for(int i = 0; i < resultArray.length; i++) {
//            int minimum = nums1[0];
//            if(nums1[i] < nums2[i]) {
//                minimum = nums1[i];
//            }else{
//                minimum = nums2[i];
//            }
//            if(nums3[i] < minimum) {
//                minimum = nums3[i];
//            }
//            if(nums4[i] < minimum) {
//                minimum = nums4[i];
//            }
//            resultArray[i] = minimum;
//            System.out.print(resultArray[i]);
//            if(i != resultArray.length - 1) {
//                System.out.print(", ");
//            }
//        }
    }
}
