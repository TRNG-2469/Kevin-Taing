package web;

import io.javalin.Javalin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        logger.info("Javalin server started on port 8080 for App ...");
        app.get("/", ctx -> ctx.result("Hello World"));
        app.get("/hello", ctx -> ctx.result("Hello World Again"));
        app.get("/user/{name}", ctx -> {
           String name = ctx.pathParam("name");
           ctx.result("Hello Again " + name.toUpperCase());
        });
        logger.debug("Javalin server started debug on port 8080 for App ...");
        app.get("/user", ctx -> {
            String name = ctx.queryParam("name");
            String age = ctx.queryParam("age");
            ctx.result("Hello Again " + name.toUpperCase() + " is " + age);
        });
    }
}
