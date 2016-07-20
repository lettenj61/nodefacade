package nodefacade
package raw
package http

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

import nodefacade.raw.net

@js.native
trait Server extends net.Server {
}
