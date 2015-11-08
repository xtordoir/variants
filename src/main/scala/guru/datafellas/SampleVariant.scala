package guru.datafellas

case class SampleVariant(sampleId: String, variantId: Int, alternateCount: Int) extends java.io.Serializable

import org.bdgenomics.adam.serialization.ADAMKryoRegistrator
import com.esotericsoftware.kryo.{ Kryo, Serializer }

class VariantKryoRegistrator extends ADAMKryoRegistrator {
  override def registerClasses(kryo: Kryo) {
    super.registerClasses(kryo)
    kryo.register(classOf[SampleVariant])
  }
}
