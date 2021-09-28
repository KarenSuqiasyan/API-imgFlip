package com.example.apiimgflipnewversion.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.apiimgflipnewversion.domain.model.Meme.Companion.TABLE_NAME
import com.google.gson.annotations.SerializedName
import java.io.Serializable


@Entity
data class Meme(
    @SerializedName("box_count")
    @ColumnInfo
    val boxCount: Int,
    @SerializedName("height")
    @ColumnInfo
    val height: Int,
    @SerializedName("id")
    @PrimaryKey
    val id: String,
    @SerializedName("name")
    @ColumnInfo
    var name: String,
    @SerializedName("url")
    @ColumnInfo
    val url: String,
    @SerializedName("width")
    @ColumnInfo
    val width: Int
) : Serializable

{
    companion object{
        const val TABLE_NAME = "meme_table"
    }
}
