public class Ticketdetails{
    
    public void ticketdetails(){
        Booktickets b=new Booktickets();
        if(b.flag1==1){
            System.out.println("Ticket Details");
            System.out.println("--------------"); 
            System.out.println("Name: "+b.pname());
            System.out.println("Age: "+b.p_age());
            System.out.println("Seat Preference: "+b.pref());
            System.out.println("No of ticket: "+b.ticketcount());
            System.out.println("Ticket Status: "+b.status());
        } 
        else if(b.flag1==2){
            Cancelticket c=new Cancelticket();
            System.out.println("Ticket Details");
            System.out.println("--------------"); 
            System.out.println("Name: "+c.name());
            System.out.println("Seat Preference: "+c.seatpref());
            System.out.println("No of ticket: "+c.tickcount());
            System.out.println("Ticket Status: "+c.status());
        }    
    }    
}
