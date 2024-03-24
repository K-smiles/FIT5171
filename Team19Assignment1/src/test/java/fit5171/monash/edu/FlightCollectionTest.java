package fit5171.monash.edu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class FlightCollectionTest {
    Flight flight;
    Airplane airplane;

    @BeforeEach
    void setUp() {
        airplane = new Airplane(1,
                "Boeing 7747",
                30,
                200,
                10);
         flight = new Flight(1,
                "Sydney",
                "Melbourne",
                "MS001",
                "Monash",
                Timestamp.valueOf("2024-03-19 15:00:00"),
                Timestamp.valueOf("2024-03-19 17:00:00"),
                airplane);
        FlightCollection.flights.add(flight);
    }

    @Test
    void getFlights() {
        ArrayList<Flight> flights = FlightCollection.getFlights();
        Flight flight1 = flights.get(0);
        try{
            assertEquals(flight,flight1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void addFlights() {
        ArrayList<Flight> container = new ArrayList<>();
        container.add(flight);
        try {
            FlightCollection.flights.clear();
            FlightCollection.addFlights(container);
            assertEquals(container, FlightCollection.flights);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Test
    void getFlightInfo() {
        assertEquals(flight, FlightCollection.getFlightInfo("Melbourne","Sydney"));
    }

    @Test
    void testGetFlightInfo() {
        assertEquals(flight, FlightCollection.getFlightInfo("Sydney"));
    }

    @Test
    void testGetFlightInfo1() {
        assertEquals(flight, FlightCollection.getFlightInfo(1));
    }
}