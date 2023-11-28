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
    TicketFactory.getTicket("Kunming","Shenzhen").also {
        if (it != null){
            it.showTicketInfo("Lower-Berth")
        }else{
            println("Buy ticket error！")
        }
    }
}