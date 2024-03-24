package fit5171.monash.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    Airplane airplane = new Airplane(1,"Boeing 7747", 30,200,10);
    Flight test = new Flight(1,"Sydney","Melbourne","MS001","Monash",  Timestamp.valueOf("2024-03-19 15:00:00"), Timestamp.valueOf("2024-03-19 17:00:00"),airplane);

    @Test
    void getFlightID() {
        assertEquals(1,test.getFlightID());
    }

    @Test
    void setFlightID() {
        test.setFlightID(3);
        assertEquals(3,test.getFlightID());
    }

    @Test
    void getDepartTo() {
        assertEquals("Sydney",test.getDepartTo());
    }

    @Test
    void setDepartTo() {
        test.setDepartTo("Brisbane");
        assertEquals("Brisbane", test.getDepartTo());
    }

    @Test
    void getDepartFrom() {
        assertEquals("Melbourne",test.getDepartFrom());
    }
}