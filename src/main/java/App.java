import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {


//        get("/", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(model, "index.hbs");
//
//        }, new HandlebarsTemplateEngine());
//
//
//
//
//        get("/heroes", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("heroes",Heros.all());
//            return new ModelAndView(model, "heros.hbs");
//
//        }, new HandlebarsTemplateEngine());
//
//
//        post("/heroes/new", (request,response)-> {
//            Map<String, Object> model = new HashMap<String, Object>();
//
//            String name = request.queryParams("name");
//            String age = request.queryParams("age");
//            String power = request.queryParams("power");
//            String weakness = request.queryParams("weakness");
//
//
//
//            Heros hero = new Heros(name, age, power, weakness);
//            model.put("name", name);
//            model.put("age", age);
//            model.put("power", power);
//            model.put("weakness", weakness);
//
//
//            return new ModelAndView(model, "successForm.hbs");
//
//
//
//        }, new HandlebarsTemplateEngine());
//
//
////        trial
//
//        get("/home", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("heroes",Heros.all());
//            return new ModelAndView(model, "home.hbs");
//
//        }, new HandlebarsTemplateEngine());
//
//        get("/squad", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("heroes",Heros.all());
//            return new ModelAndView(model, "SquadForm.hbs");
//
//        }, new HandlebarsTemplateEngine());
//
//
//
////        path
//
//             //get: delete all tasks
//        get("/tasks/delete", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            Heros.clear(); //change
//            res.redirect("/");
//            return null;
//        }, new HandlebarsTemplateEngine());
//
//                  //show all tasks
//
//        get("/", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("heroes", Heros.all());
//
//            return new ModelAndView(model, "heros.hbs");
//        },new HandlebarsTemplateEngine());
//
//              //heros:process new hero form
//        get("/heroes/new", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(model, "hero-form.hbs");
//
//        }, new HandlebarsTemplateEngine());
//
//
//        //get: show an individual squad
//        get("/squad/:id", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfSquadToFind = Integer.parseInt(req.params("id"));
//            Squad foundSquad = Squad.find(idOfSquadToFind); //change
//            model.put("squad", foundSquad);
//            return new ModelAndView(model, "");  //////////////////////////////////////////
//        }, new HandlebarsTemplateEngine());
//
//
//



//        odero

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


            Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId")));


            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");



            Heros hero = new Heros(name, age, power, weakness);

//            squad.addHero(hero);
//            model.put("squad", squad);

            return new ModelAndView(model, "successForm.hbs");



        }, new HandlebarsTemplateEngine());


        //get: show all posts
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heros> heros =Heros.all();
            model.put("Hero", heros);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//

    }


}
