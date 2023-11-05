package com.bluesky.cleannoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bluesky.cleannoteapp.feature_note.domain.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object{

        /* Todo: const val 和val修饰对象的主要区别是：

        const val 可见性为public final static，可以直接访问。
        val 可见性为private final static，并且val 会生成方法getNormalObject()，通过方法调用访问。
        总结：
        当定义常量时，出于效率考虑，我们应该使用const val方式，避免频繁函数调用。*/

        const val DATABASE_NAME="notes_db"
    }
}