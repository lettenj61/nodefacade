package com.github.lettenj61.nodefacade
package nodejs
package raw
package http

import scala.scalajs.js
import js.annotation.{ JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }

import raw.net

@js.native
trait Server extends net.Server {
}
