package com.example.myapplication23.screen.myinfo.customerservice.list

import androidx.annotation.StringRes
import com.example.myapplication23.R

/**
 * @author HeeTae Heo(main),
 * Geonwoo Kim, Doyeop Kim, Namjin Jeong, Eunho Bae (sub)
 * @since
 * @throws
 * @description
 */

enum class CSCategory(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    TOTAL(R.string.total, R.string.total_type)

}