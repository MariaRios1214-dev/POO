package Java;

class User extends Account {
  public User(Integer id, String name, String document, String email, String password){
    super(id, name, document, email, password);
  }
  void printDataUser(){
    System.out.println("{}{}" + " userName: " + name + " --- " + " documentUser: " +document);
  }
}
