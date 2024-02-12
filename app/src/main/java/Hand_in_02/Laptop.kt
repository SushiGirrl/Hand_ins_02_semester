package Hand_in_02

class Laptop(brand: String, productionNr: String, storageGB: Int, weightKg: Double): Computer(brand, productionNr, storageGB) {
    var isLidOpen: Boolean = false;
    fun openlid() {
        isLidOpen = true;
    }
    fun closeLid() {
        isLidOpen = false;
    }
}