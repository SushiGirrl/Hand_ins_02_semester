package Hand_in_03

class Car(): Vehicle {
    var gear: Int = 0;
    var speed: Int = 0;
    override fun changeGear(currentGear: Int) {
        gear = currentGear;
        println("Current gear is $gear");
    }

    override fun speedUp(speedIncrease: Int) {
        speed += speedIncrease;
        println("Current speed is $speed");
    }

    override fun applyBrakes(speedDecrease: Int) {
        if (speed < speedDecrease){
            speed = 0;
        }
        speed -= speedDecrease;
        println("speed is reduced to $speed");
    }
}