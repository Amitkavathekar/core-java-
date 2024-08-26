package day11_4interfacE_REMOTEDEVICE;

public class TVClass {


public class TV implements RemoteDevice {

    public void switchOn() {
        System.out.println("TV is now ON.");
    }

   
    public void switchOff() {
        System.out.println("TV is now OFF.");
    }
}

}
