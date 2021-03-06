package com.epamhackday.payitforward.repository

import com.epamhackday.payitforward.model.FavorType
import com.epamhackday.payitforward.model.User
import com.epamhackday.payitforward.model.UserFavor
import org.springframework.data.mongodb.repository.MongoRepository

interface UserFavorRepository extends MongoRepository<UserFavor, String> {
    List<UserFavor> findByUserEmailAndType(String userEmail, FavorType type)

    List<UserFavor> findByUserAndType(User user, FavorType type)

    List<UserFavor> findByFavorIdAndType(String favorId, FavorType type)
    List<UserFavor> findByType(FavorType type)
}
