package io.github.larrythexu.fruit_wallet_distributed.producer

import io.github.larrythexu.fruit_wallet_distributed.trade.TradeEvent
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

private val log = LoggerFactory.getLogger(KafkaProducer::class.java)

@Service
class KafkaProducer (
    private val kafkaTemplate: KafkaTemplate<String, TradeEvent>
) {

    fun sendMessage(message: TradeEvent) {
        log.info("Sending message: {}", message.toString())
        kafkaTemplate.send("trades", message)
    }
}