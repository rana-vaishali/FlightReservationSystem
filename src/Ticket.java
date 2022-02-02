import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Date arrival;
    private Date depart;

    public Ticket(String pnrNo,String from,String to,String departDateTime,String arrivalDateTime,String seatNo,float price,boolean isCancelled,Flight flight,Passenger passenger){
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.setDepartDateTime(departDateTime);
        this.setArrivalDateTime(arrivalDateTime);
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
            int days = this.arrival.getDate() - this.depart.getDate();
            int hoursOfFlight = this.arrival.getHours() -this.depart.getHours();//get hours from date
         //   System.out.println(days +"days "+hoursOfFlight +"hours");
        return hoursOfFlight;
    }
    public void cancel(){
        this.isCancelled = true;
    }

    public String getPnrNo(){
        return this.pnrNo;
    }

    public void setDepartDateTime(String departDateTime){
        try{
            Date departure=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(departDateTime);
            this.depart = departure;
        }
        catch(Exception e){
            System.out.println("DepartureDateTime should be in format MM/DD/YY hh:mm:ss");

        }
    }
    public void setArrivalDateTime(String arrivalDateTime){
        try{
            Date arrival=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(arrivalDateTime);
            this.arrival = arrival;
        }
        catch(Exception e){
            System.out.println("ArrivalDateTime should be in format MM/DD/YY hh:mm:ss ");

        }
    }
    public String getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
       this.price = price;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

 }
