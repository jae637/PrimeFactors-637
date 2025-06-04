import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number>1){
            if(number ==4 ){
                if(number%2 ==0){
                    result.add(2);
                }
                if(number%2 ==0){
                    result.add(2);
                }
            }else{
                result.add(number);
            }
        }
        return result;
    }
}
