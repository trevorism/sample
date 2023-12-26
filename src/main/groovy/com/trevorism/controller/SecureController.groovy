package com.trevorism.controller

import com.trevorism.secure.Roles
import com.trevorism.secure.Secure
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/secure")
class SecureController {

    @Get(value =  "/", produces = MediaType.TEXT_PLAIN)
    @Secure(value = Roles.USER)
    String get(){
        "secure"
    }
}
