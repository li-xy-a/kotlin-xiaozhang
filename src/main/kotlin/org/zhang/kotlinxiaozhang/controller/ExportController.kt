package org.zhang.kotlinxiaozhang.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RequestMapping("/export")
@RestController
class ExportController {

    /**
     * 请假导入
     */
    @PostMapping("/leave")
    fun exportExcel(file : MultipartFile) : Unit{

    }

}