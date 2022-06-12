import java.util.*;
public class Cancelticket extends Booktickets {
    Booktickets b=new Booktickets();
    static String name="", cpref="";
    static int cnooftick; 
    static String status="";
    public void cancel(String name, String cpref, int cnooftick){
        b.flag1=2;
        this.name=name; 
        this.cpref=cpref; 
        this.cnooftick=cnooftick;
        if(cpref.equals("upper")){
            if(b.seats[0]==21){
                System.out.println("No tickets has been booked!");
                status="Ticket not booked!";
            } 
            else if(b.seats[0]<21){
                if(b.seats[0]+cnooftick<=21){
                    b.seats[0]+=cnooftick;
                    System.out.println("Tickets cancellation done successfully!");
                    status=cnooftick+" upper berth tickets cancelled successfully!";
                }
            }
        }
        else if(cpref.equals("lower")){
            if(b.seats[1]==21){
                System.out.println("No tickets has been booked!");
                status="Ticket not booked!";
            } 
            else if(b.seats[1]<21){
                if(b.seats[1]+cnooftick<=21){
                    b.seats[1]+=cnooftick;
                    System.out.println("Tickets cancellation done successfully!");
                    status=cnooftick+" lower berth tickets cancelled successfully!";
                }
            }
        }
        else if(cpref.equals("middle")){
            if(b.seats[2]==21){
                System.out.println("No tickets has been booked!");
                status="Ticket not booked!";
            } 
            else if(b.seats[2]<21){
                if(b.seats[2]+cnooftick<=21){
                    b.seats[2]+=cnooftick;
                    System.out.println("Tickets cancellation done successfully!");
                    status=cnooftick+" middle berth tickets cancelled successfully!";
                }
            }
        } 
        else if(cpref.equals("RAC")){
            if(b.seats[3]==21){
                System.out.println("No tickets has been booked!");
                status="Ticket not booked!";
            } 
            else if(b.seats[3]<21){
                if(b.seats[3]+cnooftick<=21){
                    b.seats[3]+=cnooftick;
                    System.out.println("Tickets cancellation done successfully!");
                    status=cnooftick+" RAC tickets cancelled successfully!";
                }
            }
        }
        else if(cpref.equals("waitinglist")){
            if(b.seats[4]==21){
                System.out.println("No tickets has been booked!");
                status="Ticket not booked!";
            } 
            else if(b.seats[4]<21){
                if(b.seats[4]+cnooftick<=21){
                    b.seats[4]+=cnooftick;
                    System.out.println("Tickets cancellation done successfully!");
                    status=cnooftick+" waiting list tickets cancelled successfully!";
                }
            }
        }  
        if(18-b.seats[3]>0){
            if(b.seats[0]!=0){
                int rac=18-b.seats[3]; 
                if(rac!=0){
                    if(b.seats[0]-rac>=0){
                        b.seats[0]-=rac; 
                        b.seats[3]+=rac;
                    } 
                    else{
                        int excess=rac-b.seats[0]; 
                        b.seats[3]+=rac-excess;
                        b.seats[0]-=(rac-excess);
                    }
                }
            }
            else if(b.seats[1]!=0){
                int rac=18-b.seats[3]; 
                if(rac!=0){
                    if(b.seats[1]-rac>=0){
                        b.seats[1]-=rac; 
                        b.seats[3]+=rac;
                    } 
                    else{
                        int excess=rac-b.seats[1]; 
                        b.seats[3]+=rac-excess;
                        b.seats[1]-=(rac-excess);
                    }
                }
            }
            else if(b.seats[2]!=0){
                int rac=18-b.seats[3]; 
                if(rac!=0){
                    if(b.seats[2]-rac>=0){
                        b.seats[2]-=rac; 
                        b.seats[3]+=rac;
                    } 
                    else{
                        int excess=rac-b.seats[2]; 
                        b.seats[3]+=rac-excess;
                        b.seats[2]-=(rac-excess);
                    }
                }
            }        
        }      
        if(10-b.seats[4]>0){
            int waiting=10-b.seats[4]; 
            if(b.seats[3]>=waiting){
                b.seats[3]-=waiting;
            } 
            else{
                int excess1=waiting-b.seats[3]; 
                b.seats[3]-=(waiting-excess1); 
                b.seats[4]+=(waiting-excess1);
            }
        }
    } 
    public String name(){
        return name;
    } 
    public String seatpref(){
        return cpref;
    } 
    public int tickcount(){
        return cnooftick;
    } 
    public String status(){
        return status;
    }
}
