package com.github.lettenj61.nodefacade

import scala.scalajs.js
import js.Dynamic.{ literal => Let }

import nodejs.http

object Runner1 extends js.JSApp {
  def main(): Unit = {
    import nodejs.raw.http.IncomingMessage

    http.createServer { (_: IncomingMessage, response: js.Dynamic) =>
      response.writeHead(200, Let("Content-Type" -> "text/plain"))
      response.end("hello from Scala.js!")
    }.listenPort(28800)
  }
}
