/*
 * Copyright 2017 Sergey Grigorev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.sergeygrigorev.util.instances

import com.github.sergeygrigorev.util.data.ElementDecoder
import com.github.sergeygrigorev.util.data.ElementDecoder.primitive

/**
 * Some often usage classes in Scala.
 */
trait JsonOtherTypes {
  implicit val stringPrimitiveParser: ElementDecoder[String] =
    primitive[String](json => json.getAsString)

  implicit val bigDecimalPrimitiveParser: ElementDecoder[BigDecimal] =
    primitive[BigDecimal](json => json.getAsBigDecimal)

  implicit val bigIntegerPrimitiveParser: ElementDecoder[BigInt] =
    primitive[BigInt](json => json.getAsBigInteger)
}
