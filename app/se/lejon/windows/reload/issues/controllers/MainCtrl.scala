package se.lejon.windows.reload.issues.controllers

import play.api.mvc.{Action, Controller}
import scaldi.{Injectable, Injector}
import se.lejon.windows.reload.issues.services.SomeService

class MainCtrl(implicit inj: Injector) extends Controller with Injectable {

    val service = inject [SomeService]

    def index() = Action { implicit request =>
        val serviceResult = service.doService("We are live!")
        Ok(serviceResult)
    }
}
