package finalexam.task1;
public class Reservation {

    private String reservationId;
    private String resourceType;
    private String startTime;
    private String endTime;

    public Reservation(String reservationId, String resourceType, String startTime, String endTime) {
        this.reservationId = reservationId;
        this.resourceType = resourceType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String toString() {
        return "Reservation ID: " + reservationId + ", Resource Type: " + resourceType +
               ", Start Time: " + startTime + ", End Time: " + endTime;
    }
}

