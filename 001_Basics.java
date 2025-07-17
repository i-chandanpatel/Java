class Basics{
  public static void main(String args[]){
    //Data Types
    
    //Integer
    int num=10;
    long num1=10;
    short num2=10;
    byte num3=10;
    //Float
    double decimal=2.4;
    float f=2.4f;  //if f not used than it will be double type
    boolean flag=true;  //Only accepts true/false not 0/1
    char c="A";
    String txt="Hello World";

    //Type casting
    double casted=num;  //Implicit
    //int castBack=casted;  //Bigger size to smaller size will not work
    int castBack=(int)casted;

    //Logical operators
    //AND-> &&
    //OR-> ||
    //NOT-> !

    //Ternery operators
    int a=4,b=5;
    int result=(a>b) ? "a is greator" : "b is greator";

    //if-else
    if(a>b)  System.out.print("a is greator");
    else if(a==b)  System.out.print("both equal");
    else  System.out.print("b is greator");

    System.out.print("Enter your age: ");
    Scanner s=new Scanner(Syatem.in);
    int age=s.nextint();
    
    //switch case
    switch(age){
      case >=18:  System.out.println("You can get license");
      case <18:  System.out.println("You can't get license");
    }
    
  }
}
