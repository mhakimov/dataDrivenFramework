package concept;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ParametersOdd extends Desyatochka {

    public ParametersOdd(int i) {
        super(i);
    }
    @Parameterized.Parameters
    public static Collection<Integer> data(){
        return Arrays.asList(new Integer[]{1,3,5,7,9,11,33,55,77,99});
    }
}
