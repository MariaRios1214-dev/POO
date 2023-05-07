package Java;

class Driver extends Account {
  String idCard;
  public Driver(Integer id, String name, String document, String email, String password, String idCard){
    super(id, name, document, email, password);
    this.idCard = idCard;
  }

  void printDataDriver(){
    System.out.println("nameDriver: " + name + " documentDriver: " +  document + " idCard: " + idCard );
  }
}
