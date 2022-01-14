public class Archer { // 암묵적으로 obj를 상속받는다 굳이 extends를 쓰지 않아도
    String name;
    String power;

    public Archer(String name, String power){
        this.name = name;
        this.power = power;

    }

    public boolean equals(Object obj){
        Archer temp = (Archer) obj;
        if (name == temp.name && power == temp.power){
            return true;
        }
        else{
            return false;
        }
    }


}
