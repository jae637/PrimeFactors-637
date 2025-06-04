import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number>1){
            if(number ==4 ){
                while(number%2==0){
                    result.add(2);
                    number/=2;
                }
            } else if (number == 6) {
                result.add(2);
                result.add(3);

            } else{
                result.add(number);
            }
        }
        return result;
    }
}
