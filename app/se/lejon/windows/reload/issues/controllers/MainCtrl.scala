package se.lejon.windows.reload.issues.controllers

import play.api.mvc.{Action, Controller}

object MainCtrl extends Controller {

    def index() = Action { implicit request =>
        Ok("Hello!")
    }
}
