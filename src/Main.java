public class Main {
    public static  void main(String[] args){
        Flight p = new Flight("ab1616","ab3333",3);
        Flight p1 = new Flight("ab1616","ab3333",3);
        Flight p2 = new Flight("ab1616","ab3333",3);
        Flight p3 = new Flight("ab1616","ab3333",3);
        System.out.println(p.getFlightDetails());
        System.out.println(p.isSeatAvailable());
        System.out.println(p1.getFlightDetails());
        System.out.println(p1.isSeatAvailable());
        System.out.println(p3.getFlightDetails());
        System.out.println(p3.isSeatAvailable());


        Passenger passenger =
                new Passenger("2nd street", "noida",
                        "UP", "Sneha Sharma",
                        "9090909090", "sneha.sharma@gmail.com");
        //System.out.println(passenger.getId());
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());

        Passenger passenger1 =
                new Passenger("3nd street", "noida",
                        "UP", "Sneha Sharma",
                        "9090909090", "sneha.sharma@gmail.com");
    //    System.out.println(passenger1.getId());
        System.out.println(passenger1.getAddressDetails());
        System.out.println(passenger1.getContactDetails());

        RegularTicket regularTicket = new RegularTicket("1222","delhi","dehradun",
                                                "12.11.22;1:03","14.11.22;2:00","12",
                                                  120.00f,false,"food",p,passenger1);
        System.out.println(regularTicket.getSpecialServices());
        regularTicket.updateSpecialServices("water");
        System.out.println(regularTicket.getSpecialServices());

        TouristTicket touristTicket = new TouristTicket("12223","delhi","dehradun",
                "12.11.22;1:03","14.11.22;2:00","12",
                120.00f,false,"13 street",p,passenger1);
        System.out.println(touristTicket.getHotelAddress());
        System.out.println(touristTicket.getTouristLocation());
        touristTicket.addTouristLocation("lake");
        touristTicket.removeTouristLocation("lake");

        System.out.println(passenger1.getPassengerCount());
        printTicketDetails(touristTicket);
       printTicketDetails(regularTicket);

    }

    public static void printTicketDetails(TouristTicket ticket){
        System.out.println(ticket.getPnrNo());
    }
    public static void printTicketDetails(RegularTicket ticket){
        System.out.println(ticket.getPnrNo());
    }
}
