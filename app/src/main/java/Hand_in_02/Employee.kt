package Hand_in_02

class Employee(firstName: String, lastName: String, salary: Double) {
    val firstName: String = firstName
    val lastName: String = lastName
    private var _salary: Double = salary
    var salary: Double
        get(){
            return _salary
        }
        set(value: Double){
            if (value >= 0){
                _salary = value;
            }
            else {
                println("Invalid, value cannot be negative. Setting value to 0.0");
                _salary = 0.0;
            }
        }
}