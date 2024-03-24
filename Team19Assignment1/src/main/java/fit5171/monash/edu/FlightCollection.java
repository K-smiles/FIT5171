package fit5171.monash.edu;

import java.util.ArrayList;
import java.util.Optional;

/**
 * 航线集合
 */
public class FlightCollection {
	
	public static ArrayList<Flight> flights;

	public static ArrayList<Flight> getFlights() {
		return flights;
	}

	public static void addFlights(ArrayList<Flight> flights) {
		FlightCollection.flights.addAll(flights);
	}
	
	public static Flight getFlightInfo(String city1, String city2) {
    	//display the flights where there is a direct flight from city 1 to city2
		return null;
    }
    
    public static Flight getFlightInfo(String city) {
    	//SELECT a flight where depart_to = city
		/*Optional<Flight> result  = flights.stream().findAny();
		Flight flight =result.filter(fight -> flight.getDepartTo().equals(city)).get();
		return flight;*/
		return null;
    }
    public static Flight getFlightInfo(int flight_id) {
    	//SELECT a flight with a particular flight id
		/*Optional<Flight> result  = flights.stream().findAny();
		Flight flight =result.filter(fight -> flight.getFlightID()== (flight_id)).get();
		return flight;*/
		return null;
    }
}
