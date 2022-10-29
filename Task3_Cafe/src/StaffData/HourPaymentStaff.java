package StaffData;

public class HourPaymentStaff extends Staff {
    public Double rate;

    public HourPaymentStaff(Integer id, String name, Double rate) {
        super(id, name);
        this.rate = rate;
    }

    @Override
    public Double getMonthPayment() {
        return 20.8 * 8 * this.rate;
    }

}
