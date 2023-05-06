package Java;

class Card extends Payment {
  Integer numberCard;
  Integer cvv;
  String date;

  public Card(Integer id, Integer cvv, String date, Integer numberCard){
    super(id);
    this.numberCard = numberCard;
    this.cvv = cvv;
    this.date = date;
  }
  
}
