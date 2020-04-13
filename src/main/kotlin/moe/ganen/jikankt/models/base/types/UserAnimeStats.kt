package moe.ganen.jikankt.models.base.types

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * User Anime Stats.
 */
data class UserAnimeStats(
    /**
     * Total amount of time spent watching anime in days.
     */
    @SerializedName("days_watched")
    val daysWatched: Double? = null,

    /**
     * Average Rating the User rates anime.
     */
    @SerializedName("mean_score")
    val meanScore: Double? = null,

    /**
     * Number of anime titles in the user's "watching" category.
     */
    @SerializedName("watching")
    val watching: Int? = null,

    /**
     * Number of anime titles in the user's "completed" category.
     */
    @SerializedName("completed")
    val completed: Int? = null,

    /**
     * Number of anime titles in the user's "on hold" category.
     */
    @SerializedName("on_hold")
    val onHold: Int? = null,

    /**
     * Number of anime titles in the user's "dropped" category.
     */
    @SerializedName("dropped")
    val dropped: Int? = null,

    /**
     * Number of anime titles in the user's "plan to watch" category.
     */
    @SerializedName("plan_to_watch")
    val planToWatch: Int? = null,

    /**
     * Total number of anime titles the user has saved.
     */
    @SerializedName("total_entries")
    val totalEntries: Int? = null,

    /**
     * Number of anime titles in the user has rewatched.
     */
    @SerializedName("rewatched")
    val rewatched: Int? = null,

    /**
     * Total number of anime episodes in the user has watched.
     */
    @SerializedName("episodes_watched")
    val episodesWatched: Int? = null
)