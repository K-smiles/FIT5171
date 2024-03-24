package fit5171.monash.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    Airplane test = new Airplane(1,"Boeing 747", 30, 200, 10);

    @Test
    void getAirplaneID() {
        assertEquals(1,test.getAirplaneID());
    }

    @Test
    void setAirplaneID() {
        test.setAirplaneID(2);
        assertEquals(2,test.getAirplaneID());
    }

    @Test
    void getAirplaneModel() {
        assertEquals("Boeing 747", test.getAirplaneModel());
    }

    @Test
    void setAirplaneModel() {
        test.setAirplaneModel("Bigplane");
        assertEquals("Bigplane",test.getAirplaneModel());
    }

    @Test
    void getBusinessSitsNumber() {
        assertEquals(30,test.getBusinessSitsNumber());
    }
}