package Cards;

import Cards.SimpleCard;

public abstract class SocialCard extends SimpleCard {
    public Boolean isActive;

    public SocialCard(Integer id) {
        this.ID = id;
        this.isActive = false;
    }

}

