package io.github.feelfreelinux.wykopmobilny.models.dataclass

import android.os.Parcelable
import com.squareup.moshi.Json
import io.github.feelfreelinux.wykopmobilny.models.pojo.apiv2.models.AuthorResponse
import kotlinx.android.parcel.Parcelize


@Parcelize data class Link(
        val id : Int,
        val title : String,
        val description : String,
        val tags : String,
        val sourceUrl : String,
        val voteCount : Int,
        var comments : List<LinkComment>,
        val commentsCount : Int,
        val relatedCount : Int,
        val author : Author?,
        val date : String,
        val preview : String?,
        val plus18 : Boolean,
        val canVote : Boolean,
        val isHot : Boolean,
        val status : String,
        val userVote : String?,
        val app : String?
) : Parcelable