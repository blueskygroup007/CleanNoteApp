package com.bluesky.cleannoteapp.feature_note.data.repository

import com.bluesky.cleannoteapp.feature_note.data.data_source.NoteDao
import com.bluesky.cleannoteapp.feature_note.domain.model.Note
import com.bluesky.cleannoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/**
 *
 * @author BlueSky
 * @date 23.11.5
 * Description:
 */
class NoteRepositoryImpl(
    val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}