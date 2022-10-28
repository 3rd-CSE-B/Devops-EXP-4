import java.util.Scanner;

class HelloWorld{
  public void helloWorld(){
   System.out.println("hello all\n");
}
public static void helloWorld(){
   System.out.println("hello everyone");
}
public static void main(String args[]){
   System.out.printf("%s","welcome to main\n");
   HelloWorld ref;
   ref= new HelloWorld();
   ref.helloWorld();
}
public void takeInput(String ch){
   Scanner input;
   input=new Scanner(System.in);
   switch(ch.toLowerCase()){
      case "int":input.nextInt();
                     break;
      case "string":input.nextLine();
                     break;
      case  "Double":input.nextDouble();               
                      break;
      case  "Float":input.nextFloat();
                       break;
      case  "Boolean":input.nextBoolean();
                        break; 
      case  default:break;              
   }
   input.close();
}
}