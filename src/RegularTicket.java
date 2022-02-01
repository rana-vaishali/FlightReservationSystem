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

    public RegularTicket(String pnrNo, String from, String to, String departDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean isCancelled, String specialServices){
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.departDateTime = departDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.isCancelled = isCancelled;
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){
        return this.specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
}
