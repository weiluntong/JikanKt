package moe.ganen.jikankt.models.base.types

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * User Manga Stats.
 */
data class UserMangaStats(
    /**
     * Total amount of time spent reading manga in days.
     */
    @SerializedName("days_read")
    val daysRead: Double? = null,

    /**
     * Average Rating the User rates manga.
     */
    @SerializedName("mean_score")
    val meanScore: Double? = null,

    /**
     * Number of manga titles in the user's "reading" category.
     */
    @SerializedName("reading")
    val reading: Int? = null,

    /**
     * Number of manga titles in the user's "completed" category.
     */
    @SerializedName("completed")
    val completed: Int? = null,

    /**
     * Number of manga titles in the user's "on hold" category.
     */
    @SerializedName("on_hold")
    val onHold: Int? = null,

    /**
     * Number of manga titles in the user's "dropped" category.
     */
    @SerializedName("dropped")
    val dropped: Int? = null,

    /**
     * Number of manga titles in the user's "plan to read" category.
     */
    @SerializedName("plan_to_read")
    val planToRead: Int? = null,

    /**
     * Total number of manga titles the user has saved.
     */
    @SerializedName("total_entries")
    val totalEntries: Int? = null,

    /**
     * Number of manga titles in the user has reread.
     */
    @SerializedName("reread")
    val reread: Int? = null,

    /**
     * Total number of manga chapters in the user has read.
     */
    @SerializedName("chapters_read")
    val chaptersRead: Int? = null,

    /**
     * Total number of manga volumes in the user has read.
     */
    @SerializedName("volumes_read")
    val volumes_read: Int? = null
)