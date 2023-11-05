package com.bluesky.cleannoteapp.feature_note.domain.util

/**
 *
 * @author BlueSky
 * @date 23.11.5
 * Description:
 */
sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)
}