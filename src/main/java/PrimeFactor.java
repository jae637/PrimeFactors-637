import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List<Integer> result = new ArrayList<>();
        if(number>=1){
            for (int divider =2 ;number >1;divider++){
                while(number%divider==0){
                    result.add(divider);
                    number/=divider;
                }
            }
        } else{
            result.add(number);
        }
        return result;
    }
}
