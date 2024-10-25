package exercise;

import io.javalin.Javalin;

import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        List<String> phones = Data.getPhones();
        List<String> domains = Data.getDomains();

        app.get("/phones", ctx -> ctx.result(phones.toString()));
        app.get("/domains", ctx -> ctx.result(domains.toString()));


        // Возвращаем настроенное приложение
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
