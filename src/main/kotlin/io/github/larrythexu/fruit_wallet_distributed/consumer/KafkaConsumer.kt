package io.github.larrythexu.fruit_wallet_distributed.consumer

import io.github.larrythexu.fruit_wallet_distributed.trade.TradeEvent
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

private val log = LoggerFactory.getLogger(KafkaConsumer::class.java)

@Service
class KafkaConsumer {

    @KafkaListener(topics = ["trades"], groupId = "myGroup")
    fun consumeMessage(message: TradeEvent) {
        log.info("Consuming message: {}", message.toString())
    }
}