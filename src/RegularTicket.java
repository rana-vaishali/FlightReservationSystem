public class RegularTicket {
    private String pnrNo;
    private String from;
    private String to;
    private String departDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean isCancelled;
    private String specialServices;
    private Flight flight;
    private Passenger passenger;

    public RegularTicket(String pnrNo, String from, String to, String departDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean isCancelled, String specialServices, Flight flight,
                         Passenger passenger){
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.departDateTime = departDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.isCancelled = isCancelled;
        this.specialServices = specialServices;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String getSpecialServices(){
        return this.specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
}
