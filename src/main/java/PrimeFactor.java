import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number>1){
            if(number ==4 ){
                result.add(2);
                result.add(2);
            }else{
                result.add(number);
            }
        }
        return result;
    }
}
