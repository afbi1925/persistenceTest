package com.kooppi.template.config;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.kooppi.template.model.user.IUserService;

public class MyApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(com.kooppi.template.model.user.v1.UserService.class).named("UserServiceV1").to(IUserService.class);
        bind(com.kooppi.template.model.user.v2.UserService.class).named("UserServiceV2").to(IUserService.class);
    }
}
