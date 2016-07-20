package nodefacade
package test

import scala.scalajs.js
import js.Dynamic.literal

import utest._
import nodefacade.nodejs._
import nodefacade.raw.http.{ Server, IncomingMessage }

object HttpTestSuite extends TestSuite {

  def server(): Server = http.createServer { (request: IncomingMessage, response: js.Dynamic) =>
    response.writeHead(200, literal("Content-Type" -> "text/plain"))
    response.end("HTTP Test Suite")
  }

  val tests = this {
    "server not listening will have no address" - {
      val testSrv = server()
      assert(server.address() eq null)
      testSrv.close()
    }
    "listening server will have address information" - {
      val testSrv = server()
      testSrv.listenPort(25560)
      assert(testSrv.address() ne null)
      println(js.JSON.stringify(testSrv.address()))
      testSrv.close()
    }
    "creating http server" - {
      val testSrv = server()
      println(util.inspect(testSrv))
      testSrv.close()
    }
  }
}

