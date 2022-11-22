package j11_상속.동물;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println("[업캐스팅");
        for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();

        System.out.println("[다운캐스팅]");
        for(int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {//Human이 animals에 담길 때 Animal로 업캐스팅된 상태 하지만 instanceof는 업캐스팅되기 전의 상태가 Human이었는지 판단한다.
                ((Human) animals[i]).readBooks();//((Human)animals[i]) 다운 캐스팅된 주소.다운캐스팅해야 readBooks()를 호출.
            }else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }
        }
    }

}
