package io.github.larrythexu.fruit_wallet_distributed.trade

import io.github.larrythexu.fruit_wallet_distributed.domain.enum.FruitType
import java.util.UUID

data class TradeEvent(
    val tradeId: UUID,
    val sellerId: Long,
    val buyerId: Long,
    val fruit: FruitType,
    val quantity: Int
)
