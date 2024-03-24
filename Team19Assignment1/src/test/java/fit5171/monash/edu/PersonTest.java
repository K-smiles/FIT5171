package fit5171.monash.edu;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* Tests Person class methods. Person is parent class of Passenger class*/
class PersonTest {

    // create object of abstract class using anonymous sub-class
    Person testPerson = new Person("bill", "smith", 40, "male") {
    };

    @BeforeEach
    void setUp() {
        testPerson.setFirstName("bill");
        testPerson.setSecondName("smith");
        testPerson.setAge(40);
        testPerson.setGender("male");
    }

    /* PE1 Test the First name retrieval */
    @Test
    void getFirstName() {
        String result = testPerson.getFirstName();
        assertTrue(result == "bill");
    }

    /* PE2 Test the Second name retrieval */

    @Test
    void getSecondName() {
        String result = testPerson.getSecondName();
        assertSame("smith" ,result);
    }

    /* PE3 Check if first name setter is working */
    @Test
    void setFirstName() {
        testPerson.setFirstName("john");
        String result = testPerson.getFirstName();
        assertSame("john" ,result);
    }

    /* PE4 Check if second name setter is working */
    @Test
    void setSecondName() {
        testPerson.setFirstName("lee");
        String result = testPerson.getFirstName();
        assertSame("lee" ,result);
    }

    /* PE5 Check if null values can be passed through the setter method */
    @Test
    void setSecondNameNull() {
        testPerson.setFirstName(null);
        String result = testPerson.getFirstName();
        assertNull(result);
    }
}



