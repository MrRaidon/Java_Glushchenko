import Cards.SimpleCard;

public class RegularCard extends SimpleCard {
    public Integer amount;
    public Integer trips;

    public RegularCard(Integer id) {
        this.ID = id;
        this.amount = 0;
        this.trips = 0;
    }

}
