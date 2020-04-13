package moe.ganen.jikankt.models.base.types

import com.google.gson.annotations.SerializedName
import moe.ganen.jikankt.models.base.MalEntity

/**
 * Sub item of MyAnimeList User's favorites list.
 */
data class UserFavoritesSubEntry(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    override val malId: Int,

    /**
     * URL of the entry's MyAnimeList page.
     */
    @SerializedName("url")
    val url: String? = null,

    /**
     * Entry's cover/image link.
     */
    @SerializedName("image_url")
    val imageUrl: String? = null,

    /**
     * Name of the sub item.
     */
    @SerializedName("name")
    val name: String? = null
) : MalEntity