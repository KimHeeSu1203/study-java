public class Main {
    public static int fibonacci_1(int number){
        int one = 1;
        int two = 1;
        int result = -1;

        if(number == 1){
            return one;
        }
        else if(number==2){
            return two;
        }
        else{
            for(int i = 2; i<number; i++){
                result = one + two;
                one = two;
                two = result;
            }
        }
        return result;
    }

    public static int fibonacci_2(int number){ // 재귀함수 -> 중복되어 구해지는 값이 엄청 많아질 것임 -> DP

        if(number == 1){
            return 1;
        }
        else if (number == 2){
            return 1;
        }
        else{
            return fibonacci_2(number-1) + fibonacci_2(number-2);
        }
    }


    public static void main(String[] args){
        System.out.println(fibonacci_2(10));
    }
}
