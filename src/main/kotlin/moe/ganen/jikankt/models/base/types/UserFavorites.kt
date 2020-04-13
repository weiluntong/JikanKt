package moe.ganen.jikankt.models.base.types

import com.google.gson.annotations.SerializedName
import java.util.*

import moe.ganen.jikankt.models.base.types.UserFavoritesSubEntry

/**
 * User Favorites.
 */
data class UserFavorites(
    /**
     * Total amount of time spent reading manga in days.
     */
    @SerializedName("anime")
    val anime: List<UserFavoritesSubEntry?>? = null,

    /**
     * Average Rating the User rates manga.
     */
    @SerializedName("manga")
    val manga: List<UserFavoritesSubEntry?>? = null,

    /**
     * Number of manga titles in the user's "reading" category.
     */
    @SerializedName("characters")
    val characters: List<UserFavoritesSubEntry?>? = null,

    /**
     * Number of manga titles in the user's "completed" category.
     */
    @SerializedName("people")
    val people: List<UserFavoritesSubEntry?>? = null
)