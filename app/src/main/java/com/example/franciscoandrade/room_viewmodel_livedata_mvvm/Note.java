package com.example.franciscoandrade.room_viewmodel_livedata_mvvm;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note  {

    //Primary Key
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String description;
    private int priority;


    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/**
 * @Entity
 * Define name of our table
 *
 * id -> primary key (with every item it gets incremented automatically)
 * title, description, priority -> Room automatically creates columns for the fields
 *
 * constructor -> Recreate from DB, No id selection as automatically generated
 *
 * setter ->  setId()  used by room to set the id number
 *
 * -----------
 * @Ignore doesnt add field to table
 *
 * @Ignore
 * private String title;
 *
 * @ColumnInfo(name= "priority_column") Changed name of row in DB
 *
 *
 */
