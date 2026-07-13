class Car(
    var carName: String,
    var model: Int,
    var owner: String,
    var milesDriven: Int,
    var originalPrice: Double
) {

    var currentPrice: Double = originalPrice

    init {
        println("Object of class is created and Init is called.")
    }

    fun getCurrentPrice() {
        currentPrice = originalPrice - (milesDriven * 100)

        // Prevent negative price
        if (currentPrice < 0)
            currentPrice = 0.0
    }

    fun displayInformation() {
        println("Car Information: $carName, $model")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: $originalPrice")
        println("Current Car Price: $currentPrice")
        println("-------------------------")
    }
}

fun main() {

    println("Creating Car Class Object car1 in next line")

    val car1 = Car(
        "BMW",
        2018,
        "Aman",
        105,
        100000.0
    )

    car1.getCurrentPrice()
    println()
    car1.displayInformation()


    println("\nCreating Car Class Object car2 in next line")

    val car2 = Car(
        "BMW",
        2019,
        "Karan",
        20,
        400000.0
    )

    car2.getCurrentPrice()
    println()
    car2.displayInformation()


    println("\n******** ArrayList in Car ********")

    val carList = ArrayList<Car>()

    val car3 = Car(
        "Toyota",
        2017,
        "KJS",
        100,
        100000.0
    )

    val car4 = Car(
        "Maruti",
        2020,
        "NPP",
        200,
        400000.0
    )

    car3.getCurrentPrice()
    car4.getCurrentPrice()

    carList.add(car3)
    carList.add(car4)

    for (car in carList) {
        println()
        car.displayInformation()
    }
}