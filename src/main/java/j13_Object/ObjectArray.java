package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj) {//어떤 자료형을 매개변수로 넣든 가능.
        return obj;

    }

    public static void main(String[] args) {
        Object[] objects = new Object[7];

        objects[0] = new Student(20220001, "김영희");
        objects[1] = new Car("쏘나타", "화이트");
        objects[2] = new Student(20220002, "박영희");
        objects[3] = new Car("k5", "블랙");
        objects[4] = new Student(20220003, "황영희");
        objects[5] = "유관순";
        objects[6] = 20221123;

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        System.out.println(objects[5].getClass());//자료형을 출력함.
        System.out.println(objects[6].getClass());//일반자료형은 Integer

    }
}
