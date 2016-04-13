package com.github.lettenj61.nodefacade
package nodejs
package raw

import scala.scalajs.js
import js.typedarray.ArrayBuffer
import js.annotation.{ JSBracketAccess, JSExport, JSName, ScalaJSDefined }
import js.Dynamic.{ global, newInstance => jsnew, literal }
import js.|

@js.native
class Buffer(size: Int) extends js.Object {
  @JSBracketAccess
  def apply(index: Int): Int = js.native
  @JSBracketAccess
  def update(index: Int, value: Int): Boolean = js.native
  def compare(otherBuffer: Buffer): Int = js.native
  def copy(targetBuffer: Buffer, targetStart: Int = 0, sourceStart: Int = 0,
            sourceEnd: Int = this.length): Int = js.native
  // TODO: How an iterators work as Dynamics?
  def entries(): js.Dynamic = js.native
  def equals(otherBuffer: Buffer): Boolean = js.native
  def fill(value: String | Int, offset: Int = 0, end: Int = this.length): Buffer = js.native
  def indexOf(value: String | Buffer | Int, byteOffset: Int = 0, encoding: String = "utf8"): Int =
    js.native
  def includes(value: String | Buffer | Int, byteOffset: Int = 0, encoding: String = "utf8"): Boolean =
    js.native
  def keys(): js.Dynamic = js.native
  val length: Int = js.native
  def readDoubleBE(offset: Int, noAssert: Boolean = false): Double = js.native
  def readDoubleLE(offset: Int, noAssert: Boolean = false): Double = js.native
  def readFloatBE(offset: Int, noAssert: Boolean = false): Float = js.native
  def readFloatLE(offset: Int, noAssert: Boolean = false): Float = js.native
  def readInt8(offset: Int, noAssert: Boolean = false): Int = js.native
  def readInt16BE(offset: Int, noAssert: Boolean = false): Int = js.native
  def readInt16LE(offset: Int, noAssert: Boolean = false): Int = js.native
  def readInt32BE(offset: Int, noAssert: Boolean = false): Long = js.native
  def readInt32LE(offset: Int, noAssert: Boolean = false): Long = js.native
  def readIntBE(offset: Int, byteLength: Int, noAssert: Boolean = false): Long = js.native
  def readIntLE(offset: Int, byteLength: Int, noAssert: Boolean = false): Long = js.native
  def readUInt8(offset: Int, noAssert: Boolean = false): Int = js.native
  def readUInt16BE(offset: Int, noAssert: Boolean = false): Int = js.native
  def readUInt16LE(offset: Int, noAssert: Boolean = false): Int = js.native
  def readUInt32BE(offset: Int, noAssert: Boolean = false): Long = js.native
  def readUInt32LE(offset: Int, noAssert: Boolean = false): Long = js.native
  def readUIntBE(offset: Int, byteLength: Int, noAssert: Boolean = false): Long = js.native
  def readUIntLE(offset: Int, byteLength: Int, noAssert: Boolean = false): Long = js.native
  def slice(start: Int = 0, end: Int = this.length): Buffer = js.native
  def toString(encoding: String = "utf8", start: Int = 0, end: Int = this.length): String = js.native
  def toJSON(): js.Object = js.native
  def values(): js.Dynamic = js.native
  def write(string: String, offset: Int = 0, length: Int = ???, encoding: String = "utf8"): Int =
    js.native
  def writeDoubleBE(value: Double, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeDoubleLE(value: Double, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeFloatBE(value: Float, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeFloatLE(value: Float, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeInt8(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeInt16BE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeInt16LE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeInt32BE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeInt32LE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeIntBE(value: Int, offset: Int, byteLength: Int, noAssert: Boolean = false): Int = js.native
  def writeIntLE(value: Int, offset: Int, byteLength: Int, noAssert: Boolean = false): Int = js.native
  def writeUInt8(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeUInt16BE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeUInt16LE(value: Int, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeUInt32BE(value: Long, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeUInt32LE(value: Long, offset: Int, noAssert: Boolean = false): Int = js.native
  def writeUIntBE(value: Int, offset: Int, byteLength: Int, noAssert: Boolean = false): Int = js.native
  def writeUIntLE(value: Int, offset: Int, byteLength: Int, noAssert: Boolean = false): Int = js.native
  val INSPECT_MAX_BYTES: Int = js.native
}

@js.native
class SlowBuffer(size: Int) extends Buffer(size)

@js.native
private trait BufferStatic extends js.Object {
  def byteLength(string: String, encoding: String = "utf8"): Int = js.native
  def compare(buf1: Buffer, buf2: Buffer): Int = js.native
  def concat(list: js.Array[Buffer], totalLength: js.UndefOr[Int] = js.undefined): Int = js.native
  def isBuffer(obj: js.Any): Boolean = js.native
  def isEncoding(encoding: String): Boolean = js.native
}

object Buffer {

  private[this] lazy val self: BufferStatic = global.Buffer.asInstanceOf[BufferStatic]
  def apply(array: js.Array[Int]): Buffer = new FromArray(array)
  def apply(buffer: Buffer): Buffer = new FromBuffer(buffer)
  def apply(arrayBuffer: js.typedarray.ArrayBuffer): Buffer = new FromArrayBuffer(arrayBuffer)
  def apply(str: String, encoding: String = "utf8"): Buffer = new FromString(str, encoding)
  def byteLength(string: String, encoding: String = "utf8"): Int = self.byteLength(string, encoding)
  def compare(buf1: Buffer, buf2: Buffer): Int = self.compare(buf1, buf2)
  def concat(list: js.Array[Buffer], totalLength: js.UndefOr[Int] = js.undefined): Int =
    self.concat(list, totalLength)
  def isBuffer(obj: js.Any): Boolean = self.isBuffer(obj)
  def isEncoding(encoding: String): Boolean = self.isEncoding(encoding)

  @JSName("Buffer")
  @js.native
  class FromArray(array: js.Array[Int]) extends Buffer(???)
  @JSName("Buffer")
  @js.native
  class FromBuffer(buffer: Buffer) extends Buffer(???)
  @JSName("Buffer")
  @js.native
  class FromArrayBuffer(arrayBuffer: js.typedarray.ArrayBuffer) extends Buffer(???)
  @JSName("Buffer")
  @js.native
  class FromString(str: String, encoding: String = "utf8") extends Buffer(???)
}
