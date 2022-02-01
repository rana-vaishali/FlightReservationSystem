public class TouristTicket {
    private String pnrNo;
    private String from;
    private String to;
    private String departDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean isCancelled;
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnrNo, String from, String to, String departDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean isCancelled, String hotelAddress
                         ){
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.departDateTime = departDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.isCancelled = isCancelled;
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
    public String CheckStatus(){
        if(isCancelled){
            return "Cancelled";
        }else{
            return "Not Cancelled";
        }

    }
}
