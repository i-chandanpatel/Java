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


// Encapsulation in Java
// In it we bind the data members and methods into a single unit.
// Encapsulation is used to hide the implementation part and show the functionality for better readability and usability.

//Advantages of Encapltulation
// Better Code Management: We can change data representation and implementation any time without changing the other codes using it if 
// we keep method parameters and return values the same. With encapsulation, we ensure that no other code would have access to implementation details and data members.
// Simpler Parameter Passing: When we pass an object to a method, everything (associated data members and methods are passed along). We do not have to pass individual members.
// getter and setter: getter (display the data) and setter method ( modify the data) are used to provide the functionality to access and modify the data, 
// and the implementation of this method is hidden from the user. The user can use this method, but cannot access the data directly.

// Using encapsulation in Java has many benefits:
// Data Hiding
// Data Integrity: Only validated or safe values can be assigned to an object’s attributes via setter methods.
// Reusability: Encapsulated code is more flexible and reusable for future modifications or requirements.
// Security

// In Java, encapsulation is implemented by declaring instance variables as private, restricting direct access.

// Disadvantages of Encapsulation
// Sometimes encapuslation can make the code complex and hard to understand if we do not use it in the right way.
// It can make it more difficult to understand how the program works because some part of the program are hidden.

// Common Mistakes To Avoid
// Exposing Internal Data Directly: Changing or reading the class variables directly without using getter and setter, breaks the encapuslation concepts.
// Not Using Access Modifiers Correctly: Not using correct access modifier can allow unauthorized access to the data.
// Overuse of Public Methods: Making all the methods public is not a good practice, only declared needed methods to be public so that the data keep safe.
// Failing to Validate Input: If we don’t check the values before setting them, wrong or bad data can go into the class, which may cause problems later.
