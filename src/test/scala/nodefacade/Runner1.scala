package nodefacade.test

import scala.scalajs.js
import js.Dynamic.{ literal => Let }

import nodefacade.nodejs._

object Runner1 extends js.JSApp {
  def main(): Unit = {
    import http.IncomingMessage

    val buffer = new Buffer.FromString("rejoice!!")

    http.createServer { (_: IncomingMessage, response: js.Dynamic) =>
      response.writeHead(200, Let("Content-Type" -> "text/plain"))
      response.end("hello from Scala.js!")
    }.listenPort(28800)
  }
}
