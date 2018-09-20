package com.example.franciscoandrade.room_viewmodel_livedata_mvvm;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = Note.class, version = 1)
public abstract class NoteDataBase extends RoomDatabase {
    private static NoteDataBase instance;

    public abstract NoteDao noteDao();

    public static synchronized  NoteDataBase getInstance(Context context){
        if (instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    NoteDataBase.class, "note_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    };
}

/**
 * @Databse
 * -Define entities we want db to contain (to add more than one {_, _})
 * -Define version
 *
 * Make instance a singleton
 *
 * noteDai s used to access Dao, room takes care of code
 *
 * getInstance()
 * *synchronized -> only one thread can accecces at the time so no accidental instance of DB in diferent threads
 */
