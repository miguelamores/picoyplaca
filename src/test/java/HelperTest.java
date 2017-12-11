package test.java;

import com.miguelamores.Helper;
import com.miguelamores.Predict;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by miguelamores on 12/8/17.
 */
public class HelperTest {

    Helper helper = new Helper();
    Predict predict = new Predict();
    String regex = "\\d+";

    @Test
    public void testGettingLastDigitOfPlateNumber(){
        assertEquals("9", helper.parsePlateNumber("pxc-0659"));
        //assertEquals("7", helper.parsePlateNumber("ghj5487"));
        //assertTrue("7890".matches(regex));
    }

    @Test
    public void testTrueWhenYouHavePicoYPlaca(){
        assertTrue(predict.calculate("poi-0981", DayOfWeek.MONDAY, LocalTime.parse("08:30")));
    }

    @Test
    public void testTrueWhenYouDoNotHavePicoYPlaca(){
        assertFalse(predict.calculate("poi-0981", DayOfWeek.WEDNESDAY, LocalTime.parse("10:30")));
    }

    @Test
    public void testLengthPlateNumber(){
        assertEquals(1, helper.parsePlateNumber("gyt-0983").length());
    }
}
