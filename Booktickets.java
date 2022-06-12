import java.util.*;
public class Booktickets {
    static String name="", spref=""; 
    static int age, nooftick;  
    static String tstatus="";
    static int[] seats={21,21,21,18,10};
    Scanner sc=new Scanner(System.in);
    static int flag1=0;
    int flag=0;
    public void booktickets(String name,int age, String spref, int nooftick){
        flag1=1;
        this.name=name; 
        this.age=age; 
        this.spref=spref;
        this.nooftick=nooftick;  
        if(spref.equals("upper")){
            if(seats[0]>=nooftick){
                seats[0]-=nooftick;
                System.out.println("Ticket Booked Successfully!");
                tstatus=nooftick+" tickets booked successfully in upper berth!";
            }    
            else{ 
                System.out.println("No ticket available");  
                tstatus="Ticket unavailable";
                flag=1;
            }    
        }           
        else if(spref.equals("lower")){
            if(seats[1]>=nooftick){
                seats[1]-=nooftick;
                System.out.println("Ticket Booked Successfully!");  
                tstatus=nooftick+" tickets booked successfully in lower berth!";
            }    
            else{
                System.out.println("No ticket available");
                tstatus="Ticket unavailable";
                flag=1;
            }     
        }        
        else if(spref.equals("middle")){
            if(seats[2]>=nooftick){
                seats[2]-=nooftick;
                System.out.println("Ticket Booked Successfully!");
                tstatus=nooftick+" tickets booked successfully in middle berth!";
            }    
            else{
                System.out.println("No ticket available");
                tstatus="Ticket unavailable";
                flag=1;
            }         
        }   
        if(flag==1){
            if(seats[3]>=nooftick){
                System.out.println("Ticket Available in RAC. Do you want to book: "); 
                System.out.print("Press 1 to book: "); 
                int rch=sc.nextInt(); 
                if(rch==1){
                    seats[3]-=nooftick;
                    System.out.println("Ticket Booked Successfully!");
                    tstatus=nooftick+" tickets booked successfully under RAC!";
                }
            } 
            else if(seats[4]>=nooftick){
                System.out.println("Ticket Available in Waiting List. Do you want to book: "); 
                System.out.print("Press 1 to book: "); 
                int rch=sc.nextInt(); 
                if(rch==1){
                    seats[4]-=nooftick;
                    System.out.print("Ticket Booked Successfully!");
                    tstatus=nooftick+" tickets booked successfully under waiting list!";
                }
            } 
            else{
                System.out.println("No ticket Available");
                tstatus="Ticket unavailable";
            }
        }
    } 
    public void available(){
        System.out.println("Ticket Availability");
        System.out.println("-------------------"); 
        System.out.println("No of tickets in upper berth: "+seats[0]);
        System.out.println("No of tickets in lower berth: "+seats[1]);
        System.out.println("No of tickets in middle berth: "+seats[2]);
        System.out.println("No of tickets in RAC: "+seats[3]);
        System.out.println("No of tickets in waitinglist: "+seats[4]);

    } 
    public String pname(){
        return name;
    } 
    public int p_age(){
        return age;
    }
    public String pref(){
        return spref;
    } 
    public int ticketcount(){
        return nooftick;
    } 
    public String status(){
        return tstatus;
    }
}
