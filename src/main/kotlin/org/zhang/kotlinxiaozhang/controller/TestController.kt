package org.zhang.kotlinxiaozhang.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController {

    @RequestMapping("/test")
    fun getTest() : String {
        return "test";
    }
}