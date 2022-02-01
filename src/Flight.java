public class Flight {
    private String flightNumber;
    private String airlineName;
    private int capacity;
    private static int totalSeatBooked;


    public Flight(String flightNumber,String airlineNumber,int capacity){
        this.flightNumber = flightNumber;
        this.airlineName = airlineNumber;
        this.capacity = capacity;
    }

    static {
        totalSeatBooked = 0;
    }

    public String getFlightDetails(){
        return "FlightNumber : "+this.flightNumber+", AirlineName : "+this.airlineName+
                ", FlightCapacity : "+this.capacity+", Number Of SeatBooked : "+this.totalSeatBooked;
    }

    public boolean isSeatAvailable(){
        if(this.totalSeatBooked<this.capacity){
            return true;
        }else{
            return false;
        }
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalSeatBooked(){
        return this.totalSeatBooked;
    }

    public void incrementBookingCounter(){
        ++totalSeatBooked;
    }
}
