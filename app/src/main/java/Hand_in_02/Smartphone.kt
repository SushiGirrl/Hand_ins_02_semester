package Hand_in_02

class Smartphone(brand: String, productionNr: String, storageGB: Int, batteryLifeHours: Int): Computer(brand, productionNr, storageGB) {

    fun takePhoto() {
        println("Took photo");
    }
}