package com.bluesky.cleannoteapp.feature_note.domain.repository

import com.bluesky.cleannoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 *
 * @author BlueSky
 * @date 23.11.5
 * Description:
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)

}