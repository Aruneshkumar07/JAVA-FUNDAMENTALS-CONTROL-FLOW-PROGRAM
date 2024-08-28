import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if(a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        switch(a){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
            default:
            System.out.println("Invalid day");
        }
         System.out.println("FOR LOOP");
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }
        System.out.println("WHILE LOOP");
        while(a!=0){
            System.out.println(a);
            a--;
        }
        System.out.println("DO WHILE LOOP");
        int start=1;
        do{
            System.out.print(start);
            start++;
        }while(start<=3);
    }
}