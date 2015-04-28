import play.api.GlobalSettings
import scaldi.play.{ControllerInjector, ScaldiSupport}
import se.lejon.windows.reload.issues.BackendModule

object Global extends GlobalSettings with ScaldiSupport {
    def applicationModule = new BackendModule :: new ControllerInjector
}
