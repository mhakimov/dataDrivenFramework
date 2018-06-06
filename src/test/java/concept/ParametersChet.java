package concept;

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ParametersChet extends Desyatochka {

    public ParametersChet(int i) {
        super(i);
    }

    @Parameterized.Parameters
    public static Collection<Integer> data(){
        return Arrays.asList(new Integer[]{2,4,6,8,22,44,66,88,0,90,80,70,60,50,40,30,20,10});
    }
}
