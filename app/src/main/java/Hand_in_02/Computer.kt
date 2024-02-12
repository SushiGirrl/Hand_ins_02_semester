package Hand_in_02

open class Computer(brand: String, productionNr: String, storageGB: Int) {
    //2 methods/functions
    //turn on and off?
    var isTurnedOn: Boolean = false;
    fun turnOn() {
        isTurnedOn = true
    }
    fun turnOff() {
        isTurnedOn = false;
        stopBrowsingWeb();
        disconnectFromWifi();
    }
    //connect to internet
    var isConnectedToWifi: Boolean = false;
    fun connectToWifi() {
        if (isTurnedOn){
            isConnectedToWifi = true;
        }
        else {
            println("The device needs to be turned on.");
        }
    }
    fun disconnectFromWifi() {
        isConnectedToWifi = false;
        stopBrowsingWeb();
    }
    //browse web
    var isBrowsingWeb: Boolean = false;
    fun browseWeb() {
        if (isTurnedOn && isConnectedToWifi){
            isBrowsingWeb = true;
        }
        else {
            println("The device needs to be turned on and connected to wifi.");
        }
    }
    fun stopBrowsingWeb() {
        isBrowsingWeb = false;
    }
}