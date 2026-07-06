fun main() {
    var c = car("Range Rover")
    println(c.model)
    println(c.price)

}
class car( var model : String){
    var price : Double = 0.0
    constructor( m: String, p: Double ) : this(m) { price = p }
}
