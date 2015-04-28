package se.lejon.windows.reload.issues.backend

import scaldi.Module
import se.lejon.wondows.reload.issue.otherservice.{SomeService, GreetingService}

class BackendModule extends Module {
    bind [SomeService] to new GreetingService
}
