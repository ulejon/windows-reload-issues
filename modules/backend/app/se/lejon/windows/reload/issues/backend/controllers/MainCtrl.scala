package se.lejon.windows.reload.issues.backend.controllers

import play.api.mvc.{Action, Controller}
import scaldi.{Injector, Injectable}
import se.lejon.wondows.reload.issue.otherservice.{GreetingService, SomeService}

class MainCtrl(implicit inj: Injector) extends Controller with Injectable {

    val service = inject [SomeService]

    def index() = Action { implicit request =>
        val service: SomeService = new GreetingService
        val serviceResult = service.doService("We are live!")
        Ok(serviceResult)
    }
}
