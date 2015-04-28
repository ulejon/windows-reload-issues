package se.lejon.wondows.reload.issue.otherservice

class GreetingService extends SomeService {
    override def doService(message: String): String = s"Welcome Mr! Message: $message"
}
