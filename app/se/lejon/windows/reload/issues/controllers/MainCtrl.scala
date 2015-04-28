package se.lejon.windows.reload.issues.controllers

import play.api.mvc.{Action, Controller}
import se.lejon.windows.reload.issues.services.{SomeService, GreetingService}

object MainCtrl extends Controller {

    def index() = Action { implicit request =>
        val service: SomeService = new GreetingService
        val serviceResult = service.doService("We are live!")
        Ok(serviceResult)
    }
}
