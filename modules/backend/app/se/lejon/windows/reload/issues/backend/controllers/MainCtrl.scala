package se.lejon.windows.reload.issues.backend.controllers

import play.api.mvc.{Action, Controller}
import se.lejon.wondows.reload.issue.otherservice.{GreetingService, SomeService}

object MainCtrl extends Controller {

    def index() = Action { implicit request =>
        val service: SomeService = new GreetingService
        val serviceResult = service.doService("We are live!")
        Ok(serviceResult)
    }
}
