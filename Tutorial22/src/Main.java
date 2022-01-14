public class Main {
    public static void main(String[] args){
        Archer archer1 = new Archer("궁수1","상");
        Archer archer2 = new Archer("궁수1","상");
        System.out.println(archer1 == archer2); // 여기서는 다르다고 항상 함
        System.out.println((archer1.equals(archer2))); // 내부적으로 가지는 값 같다고 비교해줌 원하는 형태의 비교 가능

    }
}
