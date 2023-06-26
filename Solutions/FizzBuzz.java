import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>();
        for(int i = 1; i < n + 1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                ret.add("FizzBuzz");
            }else if(i % 3 == 0) {
                ret.add("Fizz");
            }else if(i % 5 == 0) {
                ret.add("Buzz");
            }else {
                ret.add(Integer.toString(i));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        FizzBuzz testing = new FizzBuzz();
        System.out.println(testing.fizzBuzz(3));
        System.out.println(testing.fizzBuzz(5));
        System.out.println(testing.fizzBuzz(15));
    }
}
