package Opps.Inheritance;

public class SportsCar extends Car{
    String alarm;
    String navigator;
    String safeGuard;
    String noOfSeats;

    public String getAlarm() {
        return alarm;
    }
    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }
    public String getNavigator() {
        return navigator;
    }
    public void setNavigator(String navigator) {
        this.navigator = navigator;
    }
    public String getSafeGuard() {
        return safeGuard;
    }
    public void setSafeGuard(String safeGuard) {
        this.safeGuard = safeGuard;
    }
    public String getNoOfSeats() {
        return noOfSeats;
    }
    public void setNoOfSeats(String noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
