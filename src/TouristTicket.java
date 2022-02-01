public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocation;


    public TouristTicket(String pnrNo, String from, String to, String departDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean isCancelled, String hotelAddress,
                         Flight flight, Passenger passenger){
        super(pnrNo,from,to,departDateTime,arrivalDateTime,seatNo,price,isCancelled,flight,passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];

    }

    public String getHotelAddress(){
        return  this.hotelAddress;
    }

    public String[] getTouristLocation(){
        return  this.selectedTouristLocation;
    }

    public void addTouristLocation(String location){
    //added tourist location

    }
    public void removeTouristLocation(String location){
    //remove tourist location
    }

}
