import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "HerosForm.hbs");

        }, new HandlebarsTemplateEngine());

        post("/heroes", (request,response)-> {
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

    }
}
