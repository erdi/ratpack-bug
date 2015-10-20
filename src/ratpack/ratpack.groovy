import static ratpack.groovy.Groovy.ratpack
import static ratpack.handlebars.Template.handlebarsTemplate
import ratpack.handlebars.HandlebarsModule


ratpack {
    bindings {
        module(HandlebarsModule)
    }

    handlers {
        get {
            render handlebarsTemplate("index.html", items: 1..100)
        }
        prefix "image", {
            all {
                render file("logo.png")
            }
        }
    }
}