package com.bluesky.cleannoteapp.feature_note.domain.util

/**
 *
 * @author BlueSky
 * @date 23.11.5
 * Description:
 */
sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}