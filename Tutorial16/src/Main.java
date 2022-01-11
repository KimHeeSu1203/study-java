public class Main {
    public static void main(String[] args){
        Student student1 = new Student("김희수",27,161,50,"1931683",1, 1.0);
        Student student2 = new Student("최현우",29,173,75,"1731683",2, 2.0);

        student1.show();
        student2.show();

        Teacher teacher1 = new Teacher("임유진",55,155,45,"33535",600,2017);
        teacher1.show();
    }
}
