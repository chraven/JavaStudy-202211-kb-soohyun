package j10_배열;

public class Array4 {

    public static int[] add(int[] array, int value) {//다른 값들이나 같은 값들을 넣는 배열
        int[] resultArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];

        }
        resultArray[array.length] = value;//제일 마지막 인덱스에 값을 추가해 넣는다.

        return resultArray;

    }


    public static int[] getDuplicateArray(int[] array1, int[] array2) {//두 배열의 길이가 다를 때
        int[] resultArray = new int[0];//하나의 공간을 만들면 더 늘릴 수 없다. 아무것도 안 들어있는 임시배열 생성


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {//array1[0]인 상태에서 j 반복.
                    resultArray = add(resultArray, array1[i]);//새 임시배열에 중복된 값을 넣는다. 새 배열을 계속 만들면서 마지막 인덱스에 새 값을 넣는다.
                }

            }
        }
        return resultArray;
    }


    public static int[] getnonDuplicateArray(int[] array1, int[] array2) {//두 배열의 길이가 다를 때
        int[] resultArray = new int[0];//하나의 공간을 만들면 더 늘릴 수 없다.

        for (int i = 0; i < array1.length; i++) {
            int duplicateCountInArray1 = 0;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    duplicateCountInArray1++;

                }
            }
            if (duplicateCountInArray1 != 0) {//중복되었다는 뜻
                continue;
            }
            resultArray = add(resultArray, array1[i]);

        }

        for (int i = 0; i < array2.length; i++) {
            int duplicateCountInArray2 = 0;

            for (int j = 0; j < array2.length; j++) {
                if (array2[i] == array1[j]) {
                    duplicateCountInArray2++;

                }
            }
            if (duplicateCountInArray2 != 0) {
                continue;
            }
            resultArray = add(resultArray, array2[i]);
        }
        return resultArray;
    }

    public static int getMinNumberInArray(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    public static int getMaxNumberInArray(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }


    public static void main(String[] args) {

        int[] nums1  = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2  = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int[] duplicateArray = getDuplicateArray(nums1, nums2);//nums1 nums2에서 중복된 배열을 가져와라
        int[] nonDuplicateArray = getnonDuplicateArray(nums1, nums2);

        int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);//중복된 배열 중 가장 작은 값
        int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

        System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
        System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);
        /*
        1. 두 배열에서 중복된 값 중 최소값 : 6 도출
        2. 두 배열에서 중복되지 않은 값 중 최대값 : 15 도출
         */


    }
}
