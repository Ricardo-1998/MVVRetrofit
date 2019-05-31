package com.petrlr14.mvvm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "repos")
data class GitHubRepo(
    @PrimaryKey
    @field:Json("id")
    val id: Long,

    @field:Json("name")
    val name: String,
    
    @ColumnInfo(name="full_name")
    @field:Json("full_name")
    val fullName:String
)