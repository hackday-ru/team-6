package com.epamhackday.payitforward.controller

import com.epamhackday.payitforward.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/user')
class UserController {

    @Autowired
    private UserRepository userRepository

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    def get() {
        final currentUserId = '2'
        userRepository.findOne(currentUserId)
    }
}
