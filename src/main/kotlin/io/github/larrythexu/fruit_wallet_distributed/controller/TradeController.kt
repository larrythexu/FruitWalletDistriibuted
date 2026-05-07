package io.github.larrythexu.fruit_wallet_distributed.controller

import io.github.larrythexu.fruit_wallet_distributed.producer.KafkaProducer
import io.github.larrythexu.fruit_wallet_distributed.trade.TradeEvent
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TradeController (
    private val kafkaProducer: KafkaProducer
){

    @PostMapping("/message")
    fun sendMessage(@RequestBody message: TradeEvent): ResponseEntity<String> {
        kafkaProducer.sendMessage(message)
        return ResponseEntity.ok("Queued message.")
    }
}