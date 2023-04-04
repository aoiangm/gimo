package java0404.coperation;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    public void take(int money) {
        this.money = money;
        passengerCount++;
    }
}
