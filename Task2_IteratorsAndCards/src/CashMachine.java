import Cards.SocialCard;

public class CashMachine {
    public static void addMoneySocialCard(SocialCard card, Integer money) {
        if (card instanceof SchoolCard) {
            if (money < 20) {
                System.out.println("Не хватает средств");
                return;

            }
        } else if (card instanceof StudentCard) {
            if (money < 40) {
                System.out.println("Не хватает средств");
                return;

            }
        }
        card.isActive = true;
    }

    public static void addMoneyRegularCard(RegularCard card, Integer money) {
        if (money < 10) {
            card.amount += money;
            return;
        }
        card.trips = money / 50;
        card.amount += money % 50;

    }
}
