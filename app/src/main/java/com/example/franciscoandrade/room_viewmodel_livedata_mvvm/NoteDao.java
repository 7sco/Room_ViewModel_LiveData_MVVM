package com.example.franciscoandrade.room_viewmodel_livedata_mvvm;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

public interface NoteDao {
    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
//    List<Note> getAllNotes();
    LiveData<List<Note>> getAllNotes();

}

/**
 * @Dao -> Tells room NoteDao (Interface) is a DAO
 *         - Create one Dao per Entity
 *
 * Annotate methods room takes care of implementation
 * Each Methods can take more variables, cmd+b on annotation to see
 *
 * @Query -> Allows to create own query
 *
 * Room can become Live Data by default
 * - We can observe object List<Note>
 *     = if There are any changes in note_Table List<Note> will be updated and activity will be notified
 *
 *
 */
