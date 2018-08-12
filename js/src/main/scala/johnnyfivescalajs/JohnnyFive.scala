package johnnyfivescalajs

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.{Date, |}


@js.native
@JSImport("johnny-five", JSImport.Namespace)
object JohnnyFive extends js.Object {


  @ScalaJSDefined
  trait BoardOption extends js.Object {
    val id: js.UndefOr[Double | String] = js.undefined
    val port: js.UndefOr[String] = js.undefined
    val repl: js.UndefOr[Boolean] = js.undefined
    val debug: js.UndefOr[Boolean] = js.undefined
    val timeout: js.UndefOr[Double] = js.undefined
    val io: js.UndefOr[Any] = js.undefined
  }

  def Board(option: BoardOption): Board = js.native


  @js.native
  class IO protected() extends js.Object {
    def reset(): js.Any = js.native
  }

  @js.native
  class Board protected() extends js.Object {
    def this(option: BoardOption ) = this()

    var io: IO = js.native
    var id: String = js.native
    var repl: js.Any = js.native
    var isReady: Boolean = js.native
    var pins: js.Array[Pin] = js.native
    var port: String = js.native
    var inject: Repl = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def pinMode(pin: Double, mode: Double): Unit = js.native

    def analogWrite(pin: Double, value: Double): Unit = js.native

    def analogRead(pin: Double, cb: js.Function1[Double, Unit]): Unit = js.native

    def digitalWrite(pin: Double, value: Double): Unit = js.native

    def digitalRead(pin: Double, cb: js.Function1[Double, Unit]): Unit = js.native

    def servoWrite(pin: Double, angle: Double): Unit = js.native

    def shiftOut(dataPin: Pin, clockPin: Pin, isBigEndian: Boolean, value: Double): Unit = js.native

    def wait(ms: Double, cb: js.Function0[Unit]): Unit = js.native

    def loop(ms: Double, cb: js.Function0[Unit]): Unit = js.native

    def samplingInterval(ms: Double): Unit = js.native
  }


  @ScalaJSDefined
  trait ButtonOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var invert: js.UndefOr[Boolean] = js.undefined
    var isPullup: js.UndefOr[Boolean] = js.undefined
    var isPulldown: js.UndefOr[Boolean] = js.undefined
    var holdtime: js.UndefOr[Double] = js.undefined
  }

  def Button(pin: Double): Button = js.native

  def Button(config: String): Button = js.native

  def Button(option: ButtonOption): Button = js.native

  @js.native
  class Button protected() extends js.Object {
    def this(pin: Double | String | ButtonOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native
    var downValue: Double = js.native
    var upValue: Double = js.native
    var holdtime: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[Double, Unit]): this.type = js.native
  }

  
  trait PinOption extends js.Object {
    var id: js.UndefOr[Double | String] = js.undefined
    var pin: js.UndefOr[Double | String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
  }

  @ScalaJSDefined
  trait PinState extends js.Object {
    var supportedModes: js.UndefOr[js.Array[Double]] = js.undefined
    var mode: js.UndefOr[Double] = js.undefined
    var value: js.UndefOr[Double] = js.undefined
    var report: js.UndefOr[Double] = js.undefined
    var analogChannel: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Pin protected() extends js.Object {
    def this(option: Double | String | PinOption) = this()

    var id: Double | String = js.native
    var pin: Double | String = js.native
    var `type`: String = js.native
    var value: Double = js.native
    var mode: Double = js.native

    def query(cb: js.Function1[PinState, Unit]): Unit = js.native

    def high(): Unit = js.native

    def low(): Unit = js.native

    def write(value: Double): Unit = js.native

    def read(cb: js.Function2[Error, Double, Unit]): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @js.native
  object Pin extends js.Object {
    def write(pin: Double, value: Double): Unit = js.native

    def read(pin: Double, cb: js.Function2[Error, Double, Unit]): Unit = js.native
  }


  @ScalaJSDefined
  trait AccelerometerOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
  }


  @ScalaJSDefined
  trait AccelerometerGeneralOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
  }


  @ScalaJSDefined
  trait AccelerometerAnalogOption extends AccelerometerGeneralOption {
    var pins: js.UndefOr[js.Array[String]] = js.undefined
    var sensitivity: js.UndefOr[Double] = js.undefined
    var aref: js.UndefOr[Double] = js.undefined
    var zeroV: js.UndefOr[Double | js.Array[Double]] = js.undefined
    var autoCalibrate: js.UndefOr[Boolean] = js.undefined
  }


  @ScalaJSDefined
  trait AccelerometerMPU6050Option extends AccelerometerGeneralOption {
    var sensitivity: js.UndefOr[Double] = js.undefined
  }


  @ScalaJSDefined
  trait AccelerometerMMA7361Option extends AccelerometerGeneralOption {
    var sleepPin: js.UndefOr[Double | String] = js.undefined
  }

  def Accelerometer(option: AccelerometerGeneralOption | AccelerometerAnalogOption | AccelerometerMPU6050Option | AccelerometerMMA7361Option): Accelerometer = js.native

  @js.native
  class Accelerometer protected() extends js.Object {
    def this(option: AccelerometerGeneralOption | AccelerometerAnalogOption | AccelerometerMPU6050Option | AccelerometerMMA7361Option) = this()

    var id: String = js.native
    var zeroV: Double = js.native
    var pins: js.Array[String] = js.native

    def pitch: Double = js.native

    def roll: Double = js.native

    def x: Double = js.native

    def y: Double = js.native

    def z: Double = js.native

    def acceleration: Double = js.native

    def inclination: Double = js.native

    def orientation: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native

    def hasAxis(name: String): Boolean = js.native

    def enable(): Unit = js.native

    def disable(): Unit = js.native
  }


  @ScalaJSDefined
  trait AltimeterOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var address: js.UndefOr[Double] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
    var elevation: js.UndefOr[Double] = js.undefined
  }

  def Altimeter(option: AltimeterOption): Altimeter = js.native

  @js.native
  class Altimeter protected() extends js.Object {
    def this(option: AltimeterOption) = this()

    var id: String = js.native

    def feet: Double = js.native

    def meters: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }


  def Animation(servo: Servo): Animation = js.native

  def Animation(servo: js.Array[Servo]): Animation = js.native

  @js.native
  class Animation protected() extends js.Object {
    def this(option: Servo | js.Array[Servo]) = this()

    var target: Double = js.native
    var duration: Double = js.native
    var cuePoints: js.Array[Double] = js.native
    var keyFrames: Double = js.native
    var easing: String = js.native
    var loop: Boolean = js.native
    var loopback: Double = js.native
    var metronomic: Boolean = js.native
    var progress: Double = js.native
    var currentSpeed: Double = js.native
    var fps: Double = js.native

    def enqueue(segment: js.Any): Unit = js.native

    def play(): Unit = js.native

    def pause(): Unit = js.native

    def stop(): Unit = js.native

    def next(): Unit = js.native

    def speed(speed: js.Array[Double]): Unit = js.native
  }


  @ScalaJSDefined
  trait CompassOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var gauss: js.UndefOr[Double] = js.undefined
  }

  def Compass(option: CompassOption): Compass = js.native

  @js.native
  class Compass protected() extends js.Object {
    def this(option: CompassOption) = this()

    def heading: Double = js.native

    def bearing: Bearing = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait Bearing extends js.Object {
    var name: String = js.native
    var abbr: String = js.native
    var low: Double = js.native
    var high: Double = js.native
    var heading: Double = js.native
  }

  @ScalaJSDefined
  trait ESCOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    var startAt: js.UndefOr[Double] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
    var device: js.UndefOr[String] = js.undefined
    var neutral: js.UndefOr[Double] = js.undefined
  }

  def ESC(option: Double): ESC = js.native

  def ESC(option: String): ESC = js.native

  def ESC(option: ESCOption): ESC = js.native


  @js.native
  class ESC protected() extends js.Object {
    def this(option: Double | String | ESCOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native
    var range: js.Array[Double] = js.native

    def value: Double = js.native

    def speed(value: Double): Unit = js.native

    def min(): Unit = js.native

    def max(): Unit = js.native

    def stop(): Unit = js.native
  }

  @js.native
  class Fn extends js.Object {
  }

  @js.native
  object Fn extends js.Object {
    def constrain(value: Double, lower: Double, upper: Double): Double = js.native

    def inRange(value: Double, lower: Double, upper: Double): Boolean = js.native

    def map(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native

    def fmap(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native

    def range(lower: Double, upper: Double, tick: Double): js.Array[Double] = js.native

    def scale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native

    def fscale(value: Double, fromLow: Double, fromHigh: Double, toLow: Double, toHigh: Double): Double = js.native

    def sum(values: js.Array[Double]): Double = js.native

    def toFixed(number: Double, digits: Double): Double = js.native

    def uid(): String = js.native

    def bitSize(n: Double): Double = js.native

    def bitValue(bit: Double): Double = js.native

    def int16(msb: Double, lsb: Double): Double = js.native

    def uint16(msb: Double, lsb: Double): Double = js.native

    def int24(b16: Double, b8: Double, b0: Double): Double = js.native

    def uint24(b16: Double, b8: Double, b0: Double): Double = js.native

    def int32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native

    def uint32(b24: Double, b16: Double, b8: Double, b0: Double): Double = js.native
  }

  @ScalaJSDefined
  trait GyroGeneralOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
  }

  @ScalaJSDefined
  trait GyroAnalogOption extends GyroGeneralOption {
    var pins: js.UndefOr[js.Array[String]] = js.undefined
    var sensitivity: js.UndefOr[Double] = js.undefined
    var resolution: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait GyroMPU6050Option extends GyroGeneralOption {
    var sensitivity: js.UndefOr[Double] = js.undefined
  }

  def Gyro(option: GyroAnalogOption): Gyro = js.native

  def Gyro(option: GyroGeneralOption): Gyro = js.native

  def Gyro(option: GyroMPU6050Option): Gyro = js.native

  @js.native
  class Gyro protected() extends js.Object {
    def this(option: GyroGeneralOption | GyroAnalogOption | GyroMPU6050Option) = this()

    var id: String = js.native
    var pins: js.Array[String] = js.native

    def isCalibrated: Boolean = js.native

    def pitch: js.Any = js.native

    def roll: js.Any = js.native

    def yaw: js.Any = js.native

    def rate: js.Any = js.native

    def x: Double = js.native

    def y: Double = js.native

    def z: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native

    def recalibrate(): Unit = js.native
  }

  @ScalaJSDefined
  trait HygrometerOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
  }

  def Hygrometer(option: HygrometerOption): Hygrometer = js.native

  @js.native
  class Hygrometer protected() extends js.Object {
    def this(option: HygrometerOption) = this()

    var id: String = js.native

    def relativeHumidity: Double = js.native

    def RH: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait IMUGeneralOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait IMUMPU6050Option extends IMUGeneralOption {
    var address: js.UndefOr[Double] = js.undefined
  }

  def IMU(option: IMUGeneralOption): IMU = js.native

  def IMU(option: IMUMPU6050Option): IMU = js.native

  @js.native
  class IMU protected() extends js.Object {
    def this(option: IMUGeneralOption | IMUMPU6050Option) = this()

    def accelerometer: Accelerometer = js.native

    def compass: Compass = js.native

    def gyro: Gyro = js.native

    def orientation: Orientiation = js.native

    def thermometer: Thermometer = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait ArrayOption extends js.Object {
    var pins: js.UndefOr[js.Array[Double] | js.Array[String]] = js.undefined
    var emitter: js.UndefOr[Double | String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait LoadCalibrationOption extends js.Object {
    var min: js.UndefOr[js.Array[Double]] = js.undefined
    var max: js.UndefOr[js.Array[Double]] = js.undefined
  }


  @js.native
  class Array protected() extends js.Object {
    def this(option: ArrayOption) = this()

    def enable(): Unit = js.native

    def disable(): Unit = js.native

    def calibrate(): Unit = js.native

    def calibrateUntil(predicate: js.Function0[Unit]): Unit = js.native

    def loadCalibration(option: LoadCalibrationOption): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait JoystickOption extends js.Object {
    var pins: js.UndefOr[js.Array[String]] = js.undefined
    var invert: js.UndefOr[Boolean] = js.undefined
    var invertX: js.UndefOr[Boolean] = js.undefined
    var invertY: js.UndefOr[Boolean] = js.undefined
  }

  def Joystick(option: JoystickOption): Joystick = js.native

  @js.native
  class Joystick protected() extends js.Object {
    def this(option: JoystickOption) = this()

    var id: String = js.native

    def x: Double = js.native

    def y: Double = js.native

    var axis: js.Array[Double] = js.native
    var raw: js.Array[Double] = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native

    def on(event: String, cb: js.Function2[Error, Date, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait LCDGeneralOption extends js.Object {
    var rows: js.UndefOr[Double] = js.undefined
    var cols: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait LCDI2COption extends LCDGeneralOption {
    var controller: js.UndefOr[String] = js.undefined
    var backlight: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait LCDParallelOption extends LCDGeneralOption {
    var pins: js.UndefOr[js.Array[js.Any]] = js.undefined
    var backlight: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class LCD protected() extends js.Object {
    def this(option: LCDGeneralOption | LCDI2COption | LCDParallelOption) = this()

    var id: String = js.native
    var rows: Double = js.native
    var cols: Double = js.native

    def print(message: String): Unit = js.native

    def useChar(char: String): Unit = js.native

    def clear(): Unit = js.native

    def cursor(row: Double, col: Double): Unit = js.native

    def home(): Unit = js.native

    def on(): Unit = js.native

    def off(): Unit = js.native

    def display(): Unit = js.native

    def noDisplay(): Unit = js.native

    def blink(): Unit = js.native

    def noBlink(): Unit = js.native

    def autoscroll(): Unit = js.native

    def noAutoscroll(): Unit = js.native

    def bgColor(color: js.Any): Unit = js.native
  }

  @ScalaJSDefined
  trait LedOption extends js.Object {
    var pin: js.UndefOr[Double] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
    var address: js.UndefOr[Double] = js.undefined
    var isAnode: js.UndefOr[Boolean] = js.undefined
  }
  
  def Led(option: LedOption): Led = js.native
  
  @js.native
  class Led protected() extends js.Object {
    def this(option: Double | LedOption) = this()

    var id: String = js.native
    var pin: Double = js.native

    def on(): Unit = js.native

    def off(): Unit = js.native

    def toggle(): Unit = js.native

    def strobe(ms: Double): Unit = js.native

    def blink(): Unit = js.native

    def blink(ms: Double): Unit = js.native

    def brightness(`val`: Double): Unit = js.native

    def fade(brightness: Double, ms: Double): Unit = js.native

    def fadeIn(ms: Double): Unit = js.native

    def fadeOut(ms: Double): Unit = js.native

    def pulse(ms: Double): Unit = js.native

    def stop(ms: Double): Unit = js.native
  }


  @ScalaJSDefined
  trait DigitsOption extends js.Object {
    var pins: js.UndefOr[js.Any] = js.undefined
    var devices: js.UndefOr[Double] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
  }

  @js.native
  class Digits protected() extends js.Object {
    def this(option: DigitsOption) = this()

    def isMatrix: Boolean = js.native

    def devices: Double = js.native

    var digitOrder: Double = js.native

    def on(): Unit = js.native

    def on(index: Double): Unit = js.native

    def off(): Unit = js.native

    def off(index: Double): Unit = js.native

    def clear(): Unit = js.native

    def clear(index: Double): Unit = js.native

    def brightness(value: Double): Unit = js.native

    def brightness(index: Double, value: Double): Unit = js.native

    def draw(position: Double, character: Double): Unit = js.native

    def draw(index: Double, position: Double, character: Double): Unit = js.native
  }

  @ScalaJSDefined
  trait MatrixOption extends js.Object {
    var pins: js.UndefOr[js.Array[Pin]] = js.undefined
    var devices: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait MatrixIC2Option extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var addresses: js.UndefOr[js.Array[js.Any]] = js.undefined
    var isBicolor: js.UndefOr[Boolean] = js.undefined
    var rotation: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Matrix protected() extends js.Object {
    def this(option: MatrixOption | MatrixIC2Option) = this()

    def isMatrix: Boolean = js.native

    def devices: Double = js.native

    def on(): Unit = js.native

    def on(index: Double): Unit = js.native

    def off(): Unit = js.native

    def off(index: Double): Unit = js.native

    def clear(): Unit = js.native

    def clear(index: Double): Unit = js.native

    def brightness(value: Double): Unit = js.native

    def brightness(index: Double, value: Double): Unit = js.native

    def led(row: Double, col: Double, state: js.Any): Unit = js.native

    def led(index: Double, row: Double, col: Double, state: js.Any): Unit = js.native

    def row(row: Double, `val`: Double): Unit = js.native

    def row(index: Double, row: Double, `val`: Double): Unit = js.native

    def column(row: Double, `val`: Double): Unit = js.native

    def column(index: Double, row: Double, `val`: Double): Unit = js.native

    def draw(position: Double, character: Double): Unit = js.native

    def draw(index: Double, position: Double, character: Double): Unit = js.native
  }

  @ScalaJSDefined
  trait RGBOption extends js.Object {
    var pins: js.UndefOr[js.Array[Double]] = js.undefined
    var isAnode: js.UndefOr[Boolean] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
  }

  @js.native
  class RGB protected() extends js.Object {
    def this(option: RGBOption) = this()

    var red: Led = js.native
    var green: Led = js.native
    var blue: Led = js.native

    def isAnode: Boolean = js.native

    def on(): Unit = js.native

    def off(): Unit = js.native

    def color(value: String): Unit = js.native

    def toggle(): Unit = js.native

    def strobe(ms: Double): Unit = js.native

    def intensity(value: Double): Unit = js.native

    def fadeIn(ms: Double): Unit = js.native

    def fadeOut(ms: Double): Unit = js.native

    def pulse(ms: Double): Unit = js.native

    def stop(ms: Double): Unit = js.native
  }


  @ScalaJSDefined
  trait MotionOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
  }

  @js.native
  class Motion protected() extends js.Object {
    def this(option: Double | MotionOption) = this()

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait MotorOption extends js.Object {
    var pins: js.UndefOr[js.Any] = js.undefined
    var current: js.UndefOr[js.Any] = js.undefined
    var invertPWM: js.UndefOr[Boolean] = js.undefined
    var address: js.UndefOr[Double] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
    var register: js.UndefOr[js.Any] = js.undefined
    var bits: js.UndefOr[js.Any] = js.undefined
  }

  @js.native
  class Motor protected() extends js.Object {
    def this(option: js.Array[Double] | MotorOption) = this()

    def isOn: Boolean = js.native

    def forward(speed: Double): Unit = js.native

    def fwd(speed: Double): Unit = js.native

    def reverse(speed: Double): Unit = js.native

    def rev(speed: Double): Unit = js.native

    def start(): Unit = js.native

    def start(speed: Double): Unit = js.native

    def stop(): Unit = js.native

    def brake(): Unit = js.native

    def release(): Unit = js.native
  }

  @ScalaJSDefined
  trait OrientiationOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Orientiation protected() extends js.Object {
    def this(option: OrientiationOption) = this()

    def euler: js.Any = js.native

    def quarternion: js.Any = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait PiezoOption extends js.Object {
    var pin: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Piezo protected() extends js.Object {
    def this(option: Double | PiezoOption) = this()

    var id: String = js.native
    var pin: Double = js.native

    def mode: Double = js.native

    def isPlaying: Boolean = js.native

    def frequency(frequency: Double, duration: Double): Unit = js.native

    def play(tune: js.Any, cb: js.Function0[Unit]): Unit = js.native

    def tone(frequency: Double, duration: Double): Unit = js.native

    def noTone(): Unit = js.native

    def off(): Unit = js.native
  }

  @ScalaJSDefined
  trait PingOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
    var pulse: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  class Ping protected() extends js.Object {
    def this(option: Double | PingOption) = this()
  }

  @ScalaJSDefined
  trait ProximityOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
  }

  @ScalaJSDefined
  trait ProximityData extends js.Object {
    var cm: js.UndefOr[Double] = js.undefined
    var in: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  class Proximity protected() extends js.Object {
    def this(option: Double | ProximityOption) = this()

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[ProximityData, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait RelayOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
  }

  @js.native
  class Relay protected() extends js.Object {
    def this(option: Double | RelayOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native

    def isOn: Boolean = js.native

    def `type`: String = js.native

    def open(): Unit = js.native

    def close(): Unit = js.native

    def toggle(): Unit = js.native
  }

  @js.native
  trait Repl extends js.Object {
    def inject(`object`: js.Any): Unit = js.native
  }

  @ScalaJSDefined
  trait SensorOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var freq: js.UndefOr[Boolean] = js.undefined
    var threshold: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Sensor protected() extends js.Object {
    def this(option: Double | String | SensorOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native
    var threshold: Double = js.native

    def boolean: Boolean = js.native

    def raw: Double = js.native

    def analog: Double = js.native

    def constrained: Double = js.native

    def value: Double = js.native

    def scaleTo(low: Double, high: Double): Double = js.native

    def fscaleTo(low: Double, high: Double): Double = js.native

    def scaleTo(range: js.Array[Double]): Double = js.native

    def fscaleTo(range: js.Array[Double]): Double = js.native

    def booleanAt(barrier: Double): Boolean = js.native

    def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait ServoGeneralOption extends js.Object {
    var pin:js.UndefOr[ Double | String] = js.undefined
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
    var startAt: js.UndefOr[Double] = js.undefined
    var isInverted: js.UndefOr[Boolean] = js.undefined
    var center: js.UndefOr[Boolean] = js.undefined
    var controller: js.UndefOr[String] = js.undefined
  }

  @ScalaJSDefined
  trait ServoPCA9685Option extends ServoGeneralOption {
    var address: js.UndefOr[Double] = js.undefined
  }

  @ScalaJSDefined
  trait ServoSweepOpts extends js.Object {
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    var interval: js.UndefOr[Double] = js.undefined
    var step: js.UndefOr[Double]= js.undefined
  }

  @js.native
  class Servo protected() extends js.Object {
    def this(option: Double | String | ServoGeneralOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native
    var range: js.Array[Double] = js.native
    var invert: Boolean = js.native
    var history: js.Array[js.Any] = js.native
    var interval: Double = js.native
    var isMoving: Boolean = js.native

    def last: js.Any = js.native

    def position: Double = js.native

    var value: Double = js.native
    var startAt: Double = js.native

    def to(degrees: Double, ms: Double, rage: Double ): Unit = js.native

    def min(): Unit = js.native

    def max(): Unit = js.native

    def center(): Unit = js.native

    def home(): Unit = js.native

    def sweep(): Unit = js.native

    def sweep(range: js.Array[Double]): Unit = js.native

    def sweep(opt: ServoSweepOpts): Unit = js.native

    def stop(): Unit = js.native

    def cw(speed: Double): Unit = js.native

    def ccw(speed: Double): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait ShiftRegisterOption extends js.Object {
    var pins: js.UndefOr[js.Any] = js.undefined
    var isAnode: js.UndefOr[Boolean] = js.undefined
  }

  @js.native
  class ShiftRegister protected() extends js.Object {
    def this(option: ShiftRegisterOption) = this()

    var id: String = js.native
    var pins: js.Any = js.native

    def value: js.Any = js.native

    def isAnode: Boolean = js.native

    def clear(): Unit = js.native

    def display(number: Double | String): Unit = js.native

    def reset(): Unit = js.native

    def send(value: Double*): Unit = js.native
  }

  @ScalaJSDefined
  trait SonarOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var device: js.UndefOr[String] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
    var threshold: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Sonar protected() extends js.Object {
    def this(option: Double | String | SonarOption) = this()

    def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native

    def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait StepperOption extends js.Object {
    var pins: js.UndefOr[js.Any] = js.undefined
    var stepsPerRev: js.UndefOr[Double] = js.undefined
    var `type`: js.UndefOr[Double] = js.undefined
    var rpm: js.UndefOr[Double] = js.undefined
    var direction: js.UndefOr[Double] = js.undefined
  }


  @ScalaJSDefined
  class TYPE extends js.Object {
  }

  @js.native
  object TYPE extends js.Object {
    var DRIVER: Double = js.native
    var TWO_WIRE: Double = js.native
    var FOUR_WIRE: Double = js.native
  }


  @js.native
  class Stepper protected() extends js.Object {
    def this(option: Double | String | StepperOption) = this()

    def step(stepsOrOpts: js.Any, cb: js.Function0[Unit]): Unit = js.native

    def rpm(): Stepper = js.native

    def rpm(value: Double): Stepper = js.native

    def speed(): Stepper = js.native

    def speed(value: Double): Stepper = js.native

    def direction(): Stepper = js.native

    def direction(value: Double): Stepper = js.native

    def accel(): Stepper = js.native

    def accel(value: Double): Stepper = js.native

    def decel(): Stepper = js.native

    def decel(value: Double): Stepper = js.native

    def cw(): Stepper = js.native

    def ccw(): Stepper = js.native

    def within(range: js.Array[Double], cb: js.Function0[Unit]): Unit = js.native

    def within(range: js.Array[Double], unit: String, cb: js.Function0[Unit]): Unit = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait SwitchOption extends js.Object {
    var pin: js.UndefOr[Double | String] = js.undefined
    var `type`: js.UndefOr[String] = js.undefined
  }

  @js.native
  class Switch protected() extends js.Object {
    def this(option: Double | String | SwitchOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native

    def isClosed: Boolean = js.native

    def isOpen: Boolean = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  }

  @ScalaJSDefined
  trait ThermometerOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var pin: js.UndefOr[String | Double] = js.undefined
    var toCelsius: js.UndefOr[js.Function1[Double, Double]] = js.undefined
    var freq: js.UndefOr[Double] = js.undefined
  }

  @js.native
  class Thermometer protected() extends js.Object {
    def this(option: ThermometerOption) = this()

    var id: String = js.native
    var pin: Double | String = js.native

    def celsius: Double = js.native

    def fahrenheit: Double = js.native

    def kelvin: Double = js.native

    def C: Double = js.native

    def F: Double = js.native

    def K: Double = js.native

    def on(event: String, cb: js.Function0[Unit]): this.type = js.native

    def on(event: String, cb: js.Function1[js.Any, Unit]): this.type = js.native
  }

}
