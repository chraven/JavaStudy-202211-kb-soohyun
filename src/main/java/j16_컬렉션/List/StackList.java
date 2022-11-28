package j16_컬렉션.List;

import java.util.ArrayList;

public class StackList {

    public static void main(String[] args) {

        // 김영희, 이영희, 박영희, 황영희, 유관순, 안창호, 안중근, 나영석

        ArrayList<String> stack = new ArrayList<String>();
    //역순으로 이름 출력하기//0으로 통일하면 하나하나 차곡차곡 쌓인다.

//        stack.add(0, "나영석");
//        stack.add(0, "안중근");
//        stack.add(0, "안창호");
//        stack.add(0, "유관순");
//        stack.add(0, "황영희");
//        stack.add(0, "박영희");
//        stack.add(0, "이영희");
//        stack.add(0, "김영희");
//
//        // 처음에 넣을 때 넣는 순서대로 쌓이니까 앞에 숫자는 굳이 안 적어도 된다.
////        stack.add(0, "나영석");
////        stack.add(1, "안중근");
////        stack.add(2, "안창호");
////        stack.add(3, "유관순");
////        stack.add(4, "황영희");
////        stack.add(5, "박영희");
////        stack.add(6, "이영희");
////        stack.add(7, "김영희");
//
//
//
//        for(String name : stack) {
//            System.out.println(name);
//            if(name.equals(stack.get(stack.size() -1))) {
//                System.out.println(", ");
//            }
//        }
//입력한 순서와 반대로 역순으로 출력하기
        stack.add("나영석");
        stack.add("안중근");
        stack.add("안창호");
        stack.add("유관순");
        stack.add("황영희");
        stack.add("박영희");
        stack.add("이영희");
        stack.add("김영희");





        ArrayList<String> copyList = new ArrayList<String>();
        int size = stack.size();//remove는 공간을 없애기 때문에 반복을 돌 때마다 size가 줄어듦. 그래서 위에 stack.size()를 고정시켜놓고 시작함

        for(int i = 0; i < size; i++) {
           copyList.add(0, stack.remove(size - i - 1));//remove는 값을 가지고 나오기도 함. 그걸 그대로 출력함.
        }

        System.out.println(copyList);
    }
}
