public class Flight {
    private String flightNumber;
    private String airlineName;
    private int capacity;
    private int totalSeatBooked;



    public Flight(String flightNumber,String airlineNumber,int capacity,int totalSeatBooked){
        this.flightNumber = flightNumber;
        this.airlineName = airlineNumber;
        this.capacity = capacity;
        this.totalSeatBooked = totalSeatBooked;
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

    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getAirlineName(){
        return this.airlineName;
    }

    public void setAirlineName(String airlineName){
        this.airlineName = airlineName;
    }
    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getTotalSeatBooked(){
        return this.totalSeatBooked;
    }

    public void setTotalSeatBooked(int seatBooked){
        this.totalSeatBooked = seatBooked;
    }

    public void incrementBookingCounter(){
        ++totalSeatBooked;
    }
}
