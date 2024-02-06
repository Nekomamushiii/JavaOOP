package WorkingAbstractionExe.Power;

public class Card {
    private RankPower rank;
    private SuitPower suit;

    public Card(RankPower rank, SuitPower suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public int add(){
       return this.rank.getValue()+this.suit.getValue();
    }
}
