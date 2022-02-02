import java.util.Arrays;

public class Main {
    public static  void main(String[] args){

        //creating flight object
        Flight flight1 = new Flight("ab1616","ab3333",100,50);
        System.out.println("Seat available in "+flight1.getFlightNumber()+"   "+flight1.isSeatAvailable());

        Flight flight2 = new Flight("ab1617","ab4444",100,100);
        System.out.println("Seat available in "+flight2.getFlightNumber()+"   "+flight2.isSeatAvailable());

        System.out.println("Flight details for Flight Number"+flight1+"  "+flight1.getFlightDetails());
        System.out.println("Flight details for Flight Number"+flight2+"  "+flight2.getFlightDetails());



        //creating passenger object
        Passenger passenger1 =
                new Passenger("2nd street", "noida",
                        "UP", "Sneha Sharma",
                        "9090909090", "sneha.sharma@gmail.com");
        System.out.println("Total number of registered Passenger"+passenger1.getPassengerCount());
        System.out.println("Address Details of passenger1 "+passenger1.getAddressDetails());
        System.out.println("Contact Details of passenger1 "+ passenger1.getContactDetails());

        Passenger passenger2 =
                new Passenger("3nd street", "delhi",
                        "UP", "neha Sharma",
                        "9090909090", "neha.sharma@gmail.com");
        System.out.println("Total number of registered Passenger"+passenger2.getPassengerCount());
        System.out.println("Address Details of passenger1 "+passenger2.getAddressDetails());
        System.out.println("Contact Details of passenger1 "+ passenger2.getContactDetails());


        //book regular ticket

        RegularTicket regularTicket = new RegularTicket("1222","delhi","dehradun",
                "14/12/21 12:00:00","14/12/21 14:00:00","12",
                                                  120.00f,false,"food",flight1,passenger1);
        System.out.println("Flight duration in Hours : "+regularTicket.getFlightDuration());
        System.out.println("Special Service avail by customer : "+regularTicket.getSpecialServices());
        regularTicket.updateSpecialServices("water");//change special service
        System.out.println("Special Service avail by customer : "+regularTicket.getSpecialServices());

        //book tourist ticket

        String[] location = {"rishikesh","haridwar","dehradun","oly"}; // setting tourist location preffered
        TouristTicket touristTicket = new TouristTicket("12223","delhi","dehradun",
                "14/12/21 8:00:00","14/12/21 12:00:00","12",
                120.00f,false,"13 street",flight2,passenger2,location);
        System.out.println("Flight duration in Hours : "+touristTicket.getFlightDuration());
        System.out.println("Tourist locations set by User : "+Arrays.toString(touristTicket.getTouristLocation()));
        System.out.println("Hotel Address: "+touristTicket.getHotelAddress());

        touristTicket.addTouristLocation("lake"); // add tourist location
        System.out.println("Added Tourist Location : "+Arrays.toString(touristTicket.getTouristLocation()));
        touristTicket.addTouristLocation("line"); // trying to add one more in list of 5 selected
        touristTicket.removeTouristLocation("lake"); // removing tourist location
        System.out.println("Updated Tourist Locations : "+Arrays.toString(touristTicket.getTouristLocation()));

      //print ticket details
        printTicketDetails(touristTicket);
       printTicketDetails(regularTicket);

       //cancel ticket
        touristTicket.cancel();

        //checking status of ticket
        System.out.println(touristTicket.CheckStatus());
        System.out.println(regularTicket.CheckStatus());


    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNo());
    }
}
