package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();//Animal 부모 객체의 생성이 이루어지고 나서야 Human, Tiger 객체 생성 가능.
        Human human = new Human();//super(); 이 코드가 숨겨져 있다.
        Tiger tiger = new Tiger();

        int a = (int) 3.14;//다운캐스팅
        double d = (double) 3;//업캐스팅. 형변환 표시 안해도 됨.

        Animal hAnimal = (Animal) human;//업캐스팅 - Animal로 human 을 업캐스팅 부모 클래스로 표시하는 것.
        // hAnimal에 부모클래스의 주소값이 담긴다.
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

        animals[0] = new Human();//Animal 자료형 배열에 Human 객체를 업캐스팅해서 넣을 수 있다.
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for(int i = 0; i < animals.length; i++) {
            animals[i].move();//업캐스팅 했더라도 재정의했기 때문에, 부모 클래스에 있는 move()가 아니라 자식 클래스 move()가 실행됨.
        }


        for(int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {//instance of Human으로 생성된 객체냐 물어보는 것. T/F
                Human h = (Human) animals[i];//다운 캐스팅 - 명시적 형변환//animals[1]엔 Tiger가 담겨 있으므로 Human에 담으면 형변환 오류가 난다.
                h.readBooks();//다운캐스팅했으므로 readBooks()를 할 수 있다.
            }else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else{
                System.out.println("다운캐스팅 불가");
            }
        }
//        animal.move();
//        human.move();
//        tiger.move();
//
//        human.readBooks();
//        tiger.hunting();

        //hAnimal.// hAnimal에 부모클래스의 주소값이 담긴다. readBooks는 나오지 않음.
    }
}
