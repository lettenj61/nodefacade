package com.github.lettenj61.nodefacade
package test

import scala.scalajs.js
import js.Dynamic.literal

import utest._
import nodejs.http
import nodejs.raw.http.{ Server, IncomingMessage }

object HttpTestSuite extends TestSuite {

  val server: Server = http.createServer { (request: IncomingMessage, response: js.Dynamic) =>
    response.writeHead(200, literal("Content-Type" -> "text/plain"))
    response.end("HTTP Test Suite")
  }

  val tests = this {
    "server not listening will have no address" - {
      assert(server.address() eq null)
    }
    "listening server will have address information" - {
      server.listenPort(25560)
      assert(server.address() ne null)
      println(js.JSON.stringify(server.address()))
      server.close()
    }
    "creating http server" - {
      assert(server.emit("request") == true)
    }
  }
}

