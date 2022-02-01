public abstract class Ticket {
    private String pnrNo;
    private String from;
    private String to;
    private String departDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean isCancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnrNo,String from,String to,String departDateTime,String arrivalDateTime,String seatNo,float price,boolean isCancelled,Flight flight,Passenger passenger){
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.departDateTime = departDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.isCancelled = isCancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String CheckStatus(){
        if(isCancelled){
            return "Cancelled";
        }else{
            return "Confirmed";
        }
    }

    public int getFlightDuration(){
        return 1;
    }
    public void cancel(){
        this.isCancelled = true;
    }

    public String getPnrNo(){
        return this.pnrNo;
    }
}
