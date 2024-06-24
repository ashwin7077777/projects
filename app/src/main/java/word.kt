data class word(val word: String)
@Entity(tableName="word_table")
class word(@Primarykey @ColumnInfo(name="word") val word:String)

annotation class Entity(val tableName: String)

@Entity(tableName = "word_table")
class word(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "word") val word: String

)
