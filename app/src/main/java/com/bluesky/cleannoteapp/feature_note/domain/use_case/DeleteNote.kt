package com.bluesky.cleannoteapp.feature_note.domain.use_case

import com.bluesky.cleannoteapp.feature_note.domain.model.Note
import com.bluesky.cleannoteapp.feature_note.domain.repository.NoteRepository

/**
 *
 * @author BlueSky
 * @date 23.11.5
 * Description:
 */
class DeleteNote(
    val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}