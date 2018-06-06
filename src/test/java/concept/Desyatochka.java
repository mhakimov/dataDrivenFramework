package concept;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Desyatochka {

    int num;

    public Desyatochka(int input) {
        num= input;
    }

    @Test
    public void nationalityTest01() {
        Assert.assertTrue(num > 0);
        System.out.println(num);
    }
}
