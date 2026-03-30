package DAY9;

class Battery{
    public void powerSupply(){
        System.out.println("Still have 40% power");
    }
}
class Remote{
    Battery minBattery=new Battery();   //has a relationship
    public void changeChannel(){
        minBattery.powerSupply();
        System.out.println("Channel Changed");
    }
}
public class Relationship {
    public static void main(String[] args) {
        Remote tvRemote=new Remote();
        tvRemote.changeChannel();
    }
}