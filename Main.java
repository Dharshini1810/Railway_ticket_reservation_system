import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        int y=1;
        Booktickets b=new Booktickets();  
        outer:
        while(y==1){ 
            System.out.println("Railway Ticket Booking");
            System.out.println("---------------------------");
            System.out.println("1.Book Ticket");
            System.out.println("2.Cancel Ticket");
            System.out.println("3.Check Ticket Availability"); 
            System.out.println("4.Booked Ticket Details"); 
            System.out.println("5.Exit"); 
            System.out.println("----------------------------");
            System.out.print("Choose option from 1-5: ");
            int ch=sc.nextInt();  
            switch(ch){
                case 1:
                    System.out.print("Enter Name: ");
                    String name=sc.next(); 
                    System.out.print("Enter Age: ");
                    int age=sc.nextInt();
                    System.out.print("Seat Preference: 1.Upper berth 2.Lower berth 3.Middle birth");
                    System.out.print("Enter Preference(1-3): "); 
                    int pref=sc.nextInt(); 
                    String spref="";
                    switch(pref){
                        case 1: 
                            spref="upper";
                            break;
                        case 2: 
                            spref="lower";
                            break;    
                        case 3: 
                            spref="middle";
                            break; 
                        default:
                            System.out.println("Wrong Choice");
                            break;               
                    }  
                    System.out.print("Enter No of tickets: "); 
                    int nooftick=sc.nextInt();  
                    b.booktickets(name,age,spref,nooftick);
                    break;
                case 2: 
                    Cancelticket c=new Cancelticket(); 
                    System.out.print("Enter Name: "); 
                    String cname=sc.next(); 
                    System.out.print("Enter the booked seat preference(upper, lower, middle, RAC, waitinglist): ");
                    String cpref=sc.next(); 
                    System.out.print("Enter number of tickets to cancel: "); 
                    int cnooftick=sc.nextInt();
                    c.cancel(cname,cpref,cnooftick);
                    break;
                case 3:  
                    b.available();
                    break;
                case 4: 
                    Ticketdetails t=new Ticketdetails();
                    t.ticketdetails();
                    break;
                case 5: 
                    break outer;
                default:
                    System.out.println("Invalid Choice");
                    break;

            } 
            System.out.print("Press 1 to Continue: "); 
            y=sc.nextInt();
        }    
    }
}