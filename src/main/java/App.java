import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());


        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Heros> heros = Heros.all();
            model.put("Heros", heros);

            return new ModelAndView(model, "heroList.hbs");
        },new HandlebarsTemplateEngine());


        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());



        post("/heroes/new", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();


            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");

            Heros newHero = new Heros(name,age,power,weakness);
            model.put("hero",newHero);

            return new ModelAndView(model, "successForm.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show all posts
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heros> heros =Heros.all();
            model.put("Hero", heros);

            return new ModelAndView(model, "heroList.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show an individual post
        get("/heroes/:id", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfHeroToFind = Integer.parseInt(req.params("id")); //pull id - must match route segment
            Heros foundHero = Heros.find(idOfHeroToFind); //use it to find post
            model.put("post", foundHero); //add it to model for template to display
            return new ModelAndView(model, "hero-detail.hbs"); //individual post page.
        }, new HandlebarsTemplateEngine());

//squads
        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = Squad.all();
            model.put("Squad", squad);

            return new ModelAndView(model, "squadList.hbs");
        },new HandlebarsTemplateEngine());



        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "SquadForm.hbs");
        }, new HandlebarsTemplateEngine());



        post("/squad/new", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();


            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String cause = request.queryParams("cause");

            Squad newSquad = new Squad(name,size,cause);

            model.put("squad", newSquad);


            return new ModelAndView(model, "successSquad.hbs");
        }, new HandlebarsTemplateEngine());


    }


}
