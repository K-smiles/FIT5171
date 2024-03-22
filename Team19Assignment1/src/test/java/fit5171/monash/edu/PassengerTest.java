package fit5171.monash.edu;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    Passenger testPassenger = new Passenger("bill","smith",
                                          40,"male","bsmith@gmail.com","0123456789",
                                          "australia","1234",5678);
    //Initialise sample test data for Passneger
    @Before
    public void setUpPassengerBegin() {
        // mock Person1 data
        testPassenger = new Passenger();
        testPassenger.setAge(40);
        testPassenger.setFirstName("bill");
        testPassenger.setSecondName("smith");
        testPassenger.setEmail("bsmith@gmail.com");
        testPassenger.setPassport("EJ892003");
        testPassenger.setCardNumber("1234");
        testPassenger.setPhoneNumber("0123456789");
    }

    @BeforeEach
    void setUp() {
        testPassenger = new Passenger();
        testPassenger.setAge(40);
        testPassenger.setFirstName("bill");
        testPassenger.setSecondName("smith");
        testPassenger.setEmail("bsmith@gmail.com");
        testPassenger.setPassport("EJ892003");
        testPassenger.setCardNumber("1234");
        testPassenger.setPhoneNumber("0123456789");
    }


    /* P1 Test getter method */
    @Test
    public void getSecondName() {
        String result = testPassenger.getSecondName();
        assertEquals("smith",result);
    }

    /* P2 Test if second name is modified by setter */
    @Test
    public void setSecondName() {
        testPassenger.setSecondName("lu");
        String result = testPassenger.getSecondName();
        assertEquals("lu",result);
    }

    /* P3 Test set security code */
    @Test
    public void setSecurityCode() {
        testPassenger.setSecurityCode(1490);
        int result = testPassenger.getSecurityCode();
        assertEquals(1490,result);
    }

    /* P4 Test set passport */
    @Test
    public void setPassport() {
        testPassenger.setPassport("EJ8929999");
        String result = testPassenger.getPassport();
        assertEquals("EJ8929999",result);
    }

    /* 5 Test display method */
    @Test
    public void AtestToString() {
        String result = testPassenger.toString();
        assertEquals(("\"Passenger{\" + \" Fullname= \"+ bill+\" \"+smith+\n" +
                "  \" ,email='\" + bsmith@gmail.com + '\\'' +\n" +
                "  \", phoneNumber='\" + 0123456789 + '\\'' +\n" +
                "  \", passport='\" + EJ892003 +\n" +
                "     '}'"),result);
    }
}