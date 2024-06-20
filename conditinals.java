import java.util.Scanner;
import java.io.*;//for input output
class conditinals{
    

    public static void main(String[] args) {
        int num;
        int numb;
        int l;

 //odd even chack

        System.out.println("Enter the number:");
    Scanner se = new Scanner(System.in);//creat a function which we use for input 12
      numb= se.nextInt();



        if( numb%2==0){
            System.out.println("Even");
        }
        else{System.out.println("odd");}

//this code for input 
//  System.out.println("Enter the age:");
//Scanner sc = new Scanner(System.in);
//num= sc.nextInt();


        System.out.println("Enter the age:");
     
      num= se.nextInt();

//conditionals if else 

        if (num>18){
            System.out.print(" Adult");
            System.out.println(num);
        }
else{
    System.out.println(" Not Adult");
    System.out.println(num);
}
//switch case

System.out.println("this for switch statment:");
int w;
w=se.nextInt();
switch (w) {
    
    case  1:
    System.out.println("hello");
     break;

     case 2:
    System.out.println("Namaste");
     break;
    case 3:
    System.out.println("bonjour");
    break;

    default:
    System.out.println("invalid choice");
        break;
}
// for loop
System.out.println("For Loop");
for(l=0;l<=10;l++){
    System.out.println(l);

}

// while loop 

System.out.println("while loop");
l=3; 
while(l<10){
    System.out.println(l);
    l++;
}








  }
 }

