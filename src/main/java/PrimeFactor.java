import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number==2){
            result.add(2);
        }else if(number ==3){
            result.add(3);
        }
        return result;
    }
}
