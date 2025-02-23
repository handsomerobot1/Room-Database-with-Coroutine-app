package com.example.roomdatabasewithcoroutines

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(

    @PrimaryKey(autoGenerate = true)
    val id:Int?,
    @ColumnInfo(name = "first_name")
    val firstName:String?,
    @ColumnInfo(name = "last_name")
    val lastName:String?,
    @ColumnInfo(name = "roll_number")
    val rollNumber:Int?
)
