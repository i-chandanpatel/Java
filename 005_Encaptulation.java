class Student{
  //If instance var private than it can't be accessed outside the Class.
  //For setting value we use a method called Setters and for retrieving
  //value we use methode called Getters
  private int age;
  private String name;
  
  //Getters
  public int getAge(){
    return age;
  }
  public void getName(){
    System.out.println(name);
  }

  //Setters
  public void setAge(int age){
    this.age=age;
  }
  public void setName(String name){
    this.name=name;
  }
}

class Main {
    public static void main(String[] args) {
      Student s=new Student();
      s.setName("Denver");
      s.getName();
      
    }
}
