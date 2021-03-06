package com.example.myapplication23.data.repository.restaurant

import com.example.myapplication23.model.homelist.HomeItemModel
import com.example.myapplication23.screen.home.homelist.HomeCategory

///**
// * HomeListFragment의 Item에 대한 repository
// * @author Doyeop Kim (main),
// * Geonwoo Kim, Heetae Heo, Namjin Jeong, Eunho Bae (sub)
// * @since 2022/01/18
// */
class DefaultHomeRepository : HomeRepository {
    override fun getList(homeCategory: HomeCategory): List<HomeItemModel> {
        // TODO Delete category all?
        val mockList = listOf(
            HomeItemModel(
                1, "all1", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all2", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all3", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all4", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all5", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all6", HomeCategory.ALL
            ),
            HomeItemModel(
                1, "all7", HomeCategory.ALL
            ),


            HomeItemModel(
                1, "food1", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food2", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food3", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food4", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food5", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food6", HomeCategory.FOOD
            ),
            HomeItemModel(
                1, "food7", HomeCategory.FOOD
            ),

            HomeItemModel(
                1, "mart1", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart2", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart3", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart4", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart5", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart6", HomeCategory.MART
            ),
            HomeItemModel(
                1, "mart7", HomeCategory.MART
            ),


            HomeItemModel(
                1, "service1", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service2", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service3", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service4", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service5", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service6", HomeCategory.SERVICE
            ),
            HomeItemModel(
                1, "service7", HomeCategory.SERVICE
            ),


            HomeItemModel(
                1, "fashion1", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion2", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion3", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion4", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion5", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion6", HomeCategory.FASHION
            ),
            HomeItemModel(
                1, "fashion7", HomeCategory.FASHION
            ),


            HomeItemModel(
                1, "accessory1", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory2", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory3", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory4", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory5", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory6", HomeCategory.ACCESSORY
            ),
            HomeItemModel(
                1, "accessory7", HomeCategory.ACCESSORY
            ),
        )


        return mockList.filter{ it.category == homeCategory }
    }
}
