package flyweight_pattern

import java.util.concurrent.ConcurrentHashMap

class TicketFactory {
    companion object instance {
        private var sTicketMap: ConcurrentHashMap<String, Ticket> = ConcurrentHashMap()
        fun getTicket(from: String, to: String): Ticket? {
            val key = from + "_" + to
            return if (sTicketMap.containsKey(key)) {
                println("Use in cache：$key")
                sTicketMap[key]
            } else {
                println("Created: $key")
                val ticket = TrainTicket(from, to)
                sTicketMap[key] = ticket
                ticket
            }
        }
    }
}