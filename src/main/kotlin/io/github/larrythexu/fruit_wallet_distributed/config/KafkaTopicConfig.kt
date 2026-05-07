package io.github.larrythexu.fruit_wallet_distributed.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaTopicConfig {

    @Bean
    fun tradesTopic(): NewTopic {
        return TopicBuilder
                .name("trades")
                .build()
    }
}