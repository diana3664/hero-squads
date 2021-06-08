import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.*;

public class App {


    public static void main(String[] args) {


        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());

        get("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");

        }, new HandlebarsTemplateEngine());



        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes",Heros.all());
            return new ModelAndView(model, "heros.hbs");

        }, new HandlebarsTemplateEngine());


        post("/heroes/new", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();

            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");



            Heros hero = new Heros(name, age, power, weakness);
            model.put("name", name);
            model.put("age", age);
            model.put("power", power);
            model.put("weakness", weakness);


            return new ModelAndView(model, "successForm.hbs");



        }, new HandlebarsTemplateEngine());


//        trial

        get("/home", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes",Heros.all());
            return new ModelAndView(model, "home.hbs");

        }, new HandlebarsTemplateEngine());

        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes",Heros.all());
            return new ModelAndView(model, "SquadForm.hbs");

        }, new HandlebarsTemplateEngine());

    }


    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}
