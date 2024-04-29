package pckg_polymorph_add2;

public class ClientDevices {
    public static void main(String[] args) {

        SmartTV smart = new SmartTV();
        smart.changeProgram();
        Device smartTVDevice = new SmartTV(); //koristit cemo dio sučelja samo od devicea nikako od unuka-smartTV
        smartTVDevice.turnOn();


    }
}
