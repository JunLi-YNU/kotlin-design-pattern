package flyweight_pattern

import kotlin.random.Random

class TrainTicket(from: String, to: String) : Ticket {
    private var from: String
    private var to: String
    lateinit var bunk: String
    private var price: Int = 0
    init {
        this.from = from
        this.to = to
    }
    override fun showTicketInfo(bunk: String) {
        Random.nextInt(300).also { price = it }
        println("Buy train ticket from $from to $to,price: $price,bunk: $bunk")
    }
}