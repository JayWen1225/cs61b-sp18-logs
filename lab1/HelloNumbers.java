public class HelloNumbers{
    public static int Cumulative(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }else {
            return Cumulative(n - 1) + n;
        }
    }

    public static void main(String[] args){
        System.out.println(Cumulative(9));
    }
}