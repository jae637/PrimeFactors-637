import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number==2){
            result.add(number);
        }else if(number ==3){
            result.add(number);
        }
        return result;
    }
}
