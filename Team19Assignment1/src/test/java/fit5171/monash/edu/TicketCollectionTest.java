package fit5171.monash.edu;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TicketCollectionTest {

    // Initialise sample data

    Airplane testAirplane = new Airplane(1,"boeing747",
            30,200,10);
    String str="2024-03-19 15:00:00";
    String str2="2024-03-19 17:00:00";
    Timestamp testTimestamp = Timestamp.valueOf(str);
    Timestamp testTimestamp2 = Timestamp.valueOf(str2);

    Flight testFlight = new Flight(1,"Sydney","Melbourne",
            "MS001","Monash",
            testTimestamp, testTimestamp2,
            testAirplane
    );

    Passenger testPassenger = new Passenger("bill","smith",
            40,"male","bsmith@gmail.com","0123456789",
            "australia","1234",5678);

    Ticket testTicket = new Ticket(3,100,testFlight,true,testPassenger);

    // Initialise sample TicketCollection array
    ArrayList<Ticket> collectionTickets = new ArrayList<Ticket>();

    TicketCollection testCollect = new TicketCollection();

    /* Reset values of sample data before each test */
    @BeforeEach
    void setUp() {

        Airplane testAirplane = new Airplane(1,"boeing747",
                30,200,10);
        String str="2024-03-19 15:00:00";
        String str2="2024-03-19 17:00:00";
        Timestamp testTimestamp = Timestamp.valueOf(str);
        Timestamp testTimestamp2 = Timestamp.valueOf(str2);

        Flight testFlight = new Flight(1,"Sydney","Melbourne",
                "MS001","Monash",
                testTimestamp, testTimestamp2,
                testAirplane
        );

        Passenger testPassenger = new Passenger("bill","smith",
                40,"male","bsmith@gmail.com","0123456789",
                "australia","1234",5678);

        Ticket testTicket = new Ticket(3,100,testFlight,true,testPassenger);



        TicketCollection test = new TicketCollection();
        test.tickets = new ArrayList<Ticket>();
        ArrayList<Ticket> collectionTickets = new ArrayList<Ticket>();
    }

    /* TC1 Test if it retrieves the array from ticketcollection */
    @Test
    void getTickets() {
        TicketCollection.tickets = new ArrayList<>();
        TicketCollection.getTickets();
        assertSame(TicketCollection.tickets,TicketCollection.getTickets());
    }

    /* TC2 Test if it adds a ticket */
    @Test
    void addTickets() {
        testCollect.addTickets(collectionTickets);
        ArrayList<Ticket> result = testCollect.getTickets();
        assertNotNull(result);
    }

    /* TC3 Test the get all tickets method can run without crashing.
    No code lines written. Returns void. */
    @Test
    void getAllTickets() {
        testCollect.addTickets(collectionTickets);
        TicketCollection.getAllTickets();
    }

    /* TC4 Test the get method */
    @Test
    void getTicketInfo() {
        testCollect.addTickets(collectionTickets);
        Ticket result = TicketCollection.getTicketInfo(100);
        assertNull(result);
    }

    /* TC5 Test if can handle negative integer */
    @Test
    void getTicketInfoNegativeInteger() {
        testCollect.addTickets(collectionTickets);
        Ticket result = TicketCollection.getTicketInfo(-1);
        assertNull(result);
    }
}