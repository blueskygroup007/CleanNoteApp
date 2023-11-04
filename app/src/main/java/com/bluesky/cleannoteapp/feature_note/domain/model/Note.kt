package com.bluesky.cleannoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bluesky.cleannoteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}