package se.lejon.windows.reload.issues.services

class GreetingService extends SomeService {
    override def doService(message: String): String = s"Welcome Mr! Message: $message"
}
