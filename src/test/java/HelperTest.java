package test.java;

import com.miguelamores.Helper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by miguelamores on 12/8/17.
 */
public class HelperTest {

    Helper helper = new Helper();

    @Test
    public void testLenghtOfPlateNumber(){
        assertEquals("9", helper.parsePlateNumber("pxc-0659"));
        assertEquals("7", helper.parsePlateNumber("ghj5487"));
        assert
    }
}
