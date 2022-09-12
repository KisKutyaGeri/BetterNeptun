package hu.kocsisgeri.betterneptun.data.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "color")
data class Color(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "course_title") var title: String,
    @ColumnInfo(name = "color_value") var colorInt: Int
)