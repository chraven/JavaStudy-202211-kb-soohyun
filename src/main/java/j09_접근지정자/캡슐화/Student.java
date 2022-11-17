package j09_접근지정자.캡슐화;

public class Student {
    private String name;
    private String gender;//얘들 보려면 public으로 풀려있는 메서드를 통해서 볼 수 있다.

    public Student() {}

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);

    }
}
