package com.rev.web;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/hello", ctx -> ctx.result("Hello World Again"));
        app.get("/user/{name}", ctx -> {
           String name = ctx.pathParam("name");
           ctx.result("Hello Again " + name.toUpperCase());
        });
        app.get("/user", ctx -> {
            String name = ctx.queryParam("name");
            String age = ctx.queryParam("age");
            ctx.result("Hello Again " + name.toUpperCase() + " is " + age);
        });
    }
}
