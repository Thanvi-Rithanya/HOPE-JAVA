import java.util.*;
class Ride{
    String name;
    String pick;
    List<String>stop;
    String drop; 
    double fare;
    String status;

    Ride(String name, String pick, String drop){
        this.name=name;
        this.pick=pick;
        this.drop=drop;
        this.stop=new ArrayList<>();
        this.fare=calculation();
        this.status="Booked";
    }
    
    Ride(String name, String pick, String drop, List<String>stop){
        this.name=name;
        this.pick=pick;
        this.drop=drop;
        this.stop=stop;
        this.fare=calculation();
        this.status="Booked";
    }

    double calculation(){
        return 50+(stop.size()*50);
    }
    void showdetails(){
        System.out.println("\nCustomer "+this.name+" \nRoute :");
        System.out.print(this.pick);
        for(String s:stop){
            System.out.print("-->"+s);
        }
        System.out.print("-->"+this.drop);
        System.out.println(this.fare);
        System.out.println(this.status);
        System.out.println("--------------------------------------------------");
    }
    void cancelride(){
        if(this.status.equals("cancelled")){
            System.out.println("Ride is already cancelled");
        }
        else if(this.status.equals("completed")){
            System.out.println("Ride is already completed cannot be cancelled");
        }
        else{
            this.status="cancelled";
            this.fare=0;
            System.out.println("Ride cancelled successfully");
        }
    }
     void completeride(){
        if(this.status.equals("cancelled")){
            System.out.println("Ride is already cancelled cannot be completed");
        }
        else if(this.status.equals("completed")){
            System.out.println("Ride is already completed");
        }
        else{
            this.status="completed";
            System.out.println("Ride completed successfully");
        }
    }
}

class RideTest{ 
    public static void main(String[] args) {
        Ride R1=new Ride("Ram", "St.Joseph", "Guindy");
        R1.showdetails();
        List<String> stop= new ArrayList<>();
        stop.add("Adyar");
        stop.add("Velachery");
        Ride R2=new Ride("Shyam", "Tambaram","Guindy",stop);
        R2.showdetails();
        R1.cancelride();
        R1.showdetails();
        R2.completeride();
        R2.showdetails();
    }
}


