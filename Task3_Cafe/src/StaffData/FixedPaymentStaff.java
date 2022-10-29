package StaffData;

public class FixedPaymentStaff extends Staff {
    public Double payment;

    public FixedPaymentStaff(Integer id, String name, Double payment) {
        super(id, name);
        this.payment = payment;
    }

    @Override
    public Double getMonthPayment() {
        return this.payment;
    }
}
