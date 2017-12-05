package org.template.classification

import org.apache.predictionio.controller.EngineFactory
import org.apache.predictionio.controller.Engine

class Query(
  val text: String,
  val replyTo: Option[String],
  val gender: Option[String],
  val bdate: Option[String],
  val lang: Option[String],
  val platform: Option[String]
) extends Serializable

class PredictedResult(
  val queryResults: String
) extends Serializable

class ActualResult(
  val queryResults: String
) extends Serializable

object ClassificationEngine extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("als" -> classOf[NLPAlgorithm]),
      classOf[Serving])
  }
}
