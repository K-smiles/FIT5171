package fit5171.monash.edu;

import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;

public class TicketSystemTest {
    TicketSystem ticketSystem = new TicketSystem();
    TicketSystem.BuyTicket<Ticket> buyTicket = new TicketSystem.BuyTicket<Ticket>();

    Passenger passenger1;
    Passenger passenger2;

    Airplane airplane1;

    Airplane airplane2;


    /**
     * mock Person data needed in test
     */
    @Before
    public void setUpPersonData() {
        Airplane testAirplane = new Airplane(1,"boeing747",30,200,10);
        String str="2024-03-19 15:00:00";
        String str2="2024-03-19 17:00:00";
        Timestamp timestamp = Timestamp.valueOf(str);
        Timestamp timestamp2 = Timestamp.valueOf(str2);
        // mock Person1 data
        passenger1 = new Passenger();
        passenger1.setAge(20);
        passenger1.setFirstName("alex");
        passenger1.setSecondName("andy");
        passenger1.setEmail("1998823@outlook.com");
        passenger1.setPassport("EJ892003");
        passenger1.setCardNumber("card number");
        passenger1.setPhoneNumber("12345678");

        // mock Person2 data
        passenger2 = new Passenger();
        passenger2.setAge(45);
        passenger2.setFirstName("Dan");
        passenger2.setSecondName("Lu");
        passenger2.setEmail("1Lksndsd@gmail.com");
        passenger2.setPassport("EJ98765");
        passenger2.setCardNumber("card number");
        passenger2.setPhoneNumber("987654");

        // mock Person1 data
        airplane1 = new Airplane(1, "direct", 10, 20, 5);
        airplane2 = new Airplane(2, "direct", 10, 20, 5);
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight(1, "Syd", "Mel", "1", "SC", new Timestamp(1), new Timestamp(20), airplane1));
        flights.add(new Flight(2, "Syd", "Beijing", "2", "SC", new Timestamp(30), new Timestamp(200), airplane2));
        // mock Person1 data
        FlightCollection.flights = new ArrayList<>();
        FlightCollection.addFlights(flights);
    }

    /**
     * test if showticket method on the condition of no data
     */
    @Test
    public void checkshowTicketOfTS1()
    {
        buyTicket.showTicket();
    }

    /**
     * test if the buyTicket work
     * @throws Exception
     */
    @Test
    public void testbuyTicketOfTS2() throws Exception {
        buyTicket.buyTicket(3);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testbuyTicketOfTS3() throws Exception {
        //mock the data of ticket
        Ticket ticket = new Ticket(1,200,FlightCollection.flights.get(0),true,null);
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket);
        TicketCollection.tickets = new ArrayList<>();
        TicketCollection.addTickets(tickets);
        buyTicket.buyTicket(1);
    }

    /**
     *  Test chooseTicket method if it can work as expectation
     * @throws Exception
     */
    @Test
    public void chooseTicketTestOfTS7() throws Exception{
        ticketSystem.chooseTicket("Sydney", "Beijing");

    }
}