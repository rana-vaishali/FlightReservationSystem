public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];
    private int userSelectedLocation;


    public TouristTicket(String pnrNo, String from, String to, String departDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean isCancelled, String hotelAddress,
                         Flight flight, Passenger passenger, String[] locations){
        super(pnrNo,from,to,departDateTime,arrivalDateTime,seatNo,price,isCancelled,flight,passenger);
        this.hotelAddress = hotelAddress;
        this.userSelectedLocation = locations.length;
        this.addSelectedLocation(locations);

    }

    public String getHotelAddress(){
        return  this.hotelAddress;
    }

    public void setHotelAddress(String address){
        this.hotelAddress=address;
    }

    public String[] getTouristLocation(){
        return  this.selectedTouristLocation;
    }

    public void setTouristLocation(String[] arr){
        this.selectedTouristLocation = arr;
    }

    public void addTouristLocation(String location){
    //added tourist location
        if(userSelectedLocation==5){
            System.out.println("5 Locations already selected");
        }
        else{
            this.selectedTouristLocation[userSelectedLocation]=location;
            userSelectedLocation++;
        }

    }
    public void removeTouristLocation(String location){
    //remove tourist location;
        int index=0;
        String[] arr= new String[5];
        for(int i=0;i<userSelectedLocation;i++){
            if(selectedTouristLocation[i].equals(location)){
                index=i;
                System.out.println(index);
                break;
            }
        }
        if(index!=0){
            for(int i=0;i<userSelectedLocation;i++){
                if(i==index){
                    continue;
                }
                arr[i]  =  this.selectedTouristLocation[i] ;
            }
            userSelectedLocation--;
            this.setTouristLocation(arr);
            System.out.println("Location removed");
        }



    }

    private void addSelectedLocation(String[] locations){
        if(userSelectedLocation<=5) {
            for(int i=0;i<locations.length;i++){
                this.selectedTouristLocation[i] = locations[i];
            }

        }else{
            System.out.println("You can select only 5 locations");
           }
    }

}
