public class Main extends Parent{ // -> parent final로 선언해서 사용 불가해짐
    public void show(){ // -> final 붙이면 문제 생긴다
        System.out.println("Hello");
    }
    public static void main(String[] args){

        Main main = new Main();
        main.show();
    }
}
