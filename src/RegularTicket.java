public class RegularTicket extends Ticket {

    private String specialServices;


    public RegularTicket(String pnrNo, String from, String to, String departDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean isCancelled, String specialServices, Flight flight,
                         Passenger passenger){
        super(pnrNo,from,to,departDateTime,arrivalDateTime,seatNo,price,isCancelled,flight,passenger);
        this.specialServices = specialServices;

    }

    public String getSpecialServices(){
        return this.specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
}
