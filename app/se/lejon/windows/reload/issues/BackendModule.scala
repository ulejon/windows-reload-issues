package se.lejon.windows.reload.issues

import scaldi.Module
import se.lejon.windows.reload.issues.services.{GreetingService, SomeService}

class BackendModule extends Module {
    bind [SomeService] to new GreetingService
}