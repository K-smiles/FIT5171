package fit5171.monash.edu;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {
    //Initialise Sample data for Ticket test cases
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

    /* Refresh the values of the test objects before each test */
    @org.junit.jupiter.api.BeforeEach
    public void setUp()
    {
        testAirplane = new Airplane(1,"boeing747",30,200,10);

        str="2024-03-19 15:00:00";
        str2="2024-03-19 17:00:00";

        testTimestamp = Timestamp.valueOf(str);
        testTimestamp2 = Timestamp.valueOf(str2);

        testFlight = new Flight(1,"Sydney","Melbourne",
                "MS001","Monash",
                testTimestamp, testTimestamp2,
                testAirplane
        );

        testPassenger = new Passenger("bill","smith",
                40,"male","bsmith@gmail.com","0123456789",
                "EJ892003","1234",5678);

       testTicket = new Ticket(3,100,testFlight,true,testPassenger);
    }


    /* T1 Test getter method for price */
    @Test
    void getPriceTest()
    {
        int result = testTicket.getPrice();
        assertEquals(100,result);
    }

    /* T2 Test price after tax method */
    @Test
    public void serviceTaxTest()
    {
        testTicket.serviceTax();
        int resultAfterTax = testTicket.getPrice();
        assertEquals(112, resultAfterTax);
    }

    /* Test 3 when age is 25 for sale ticket*/
    @Test
    public void saleByAge25() {

        testTicket.saleByAge(25);

        int testResult = testTicket.getPrice();

        assertEquals(100,testResult);
    }

    /* Test 4 when age is 14 for sale ticket*/
    @Test
    public void saleByAge14() {

        testTicket.saleByAge(14);

        int testResult = testTicket.getPrice();

        assertEquals(42,testResult);
    }

    /* Test 5 when age is 65 for sale ticket. Ticket is $0 for seniors. */
    @Test
    public void saleByAge65() {

        testTicket.saleByAge(65);

        int testResult = testTicket.getPrice();

        assertEquals(0,testResult);
    }
}