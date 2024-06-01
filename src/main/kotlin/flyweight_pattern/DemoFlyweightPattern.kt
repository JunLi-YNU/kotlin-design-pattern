package flyweight_pattern

fun main() {
    TicketFactory.getTicket("Kunming", "Shenzhen").also {
        if (it != null) {
            it.showTicketInfo("Upper-Berth")
        } else {
            println("Buy ticket error！")
        }
    }
    TicketFactory.getTicket("Shenzhen", "Kunming").also {
        if (it != null) {
            it.showTicketInfo("Lower-Berth")
        } else {
            println("Buy ticket error！")
        }
    }
    TicketFactory.getTicket("Kunming", "Shenzhen").also {
        if (it != null) {
            it.showTicketInfo("Lower-Berth")
        } else {
            println("Buy ticket error！")
        }
    }

    val i1 = 127
    val i2 = 127
    println(i1 === i2)
    val i3 = 128
    val i4 = 128
    println(i3 === i4)
}