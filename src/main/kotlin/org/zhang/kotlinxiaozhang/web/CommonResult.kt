package org.zhang.kotlinxiaozhang.web

import org.zhang.kotlinxiaozhang.enums.CommonCode

/**
 * 通用返回对象
 * @author lixy
 */
data class CommonResult<T>(var code: Long, var msg: String, var data: T) {

    /**
     * 静态方法
     */
    companion object {

        fun success() : CommonResult<Unit> {
            return CommonResult(CommonCode.SUCCESS.code, CommonCode.SUCCESS.msg, Unit)
        }

        inline fun <reified T> success(data: T): CommonResult<T> {
            return CommonResult(CommonCode.SUCCESS.code, CommonCode.SUCCESS.msg, data)
        }
    }


}

fun main() {
    val success = CommonResult.success("123")
    println(success);
}
