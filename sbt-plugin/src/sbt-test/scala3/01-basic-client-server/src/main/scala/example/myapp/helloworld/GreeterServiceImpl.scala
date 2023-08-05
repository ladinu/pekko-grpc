/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * license agreements; and to You under the Apache License, version 2.0:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is part of the Apache Pekko project, which was derived from Akka.
 */

package example.myapp.helloworld

import scala.concurrent.Future

import org.apache.pekko
import pekko.NotUsed
import pekko.stream.scaladsl.Source

import example.myapp.helloworld.grpc._

class GreeterServiceImpl extends GreeterService:

  override def sayHello(in: HelloRequest): Future[HelloReply] =
    Future.successful(HelloReply(s"Hello, ${in.name}!"))

  override def streamHellos(in: Source[HelloRequest, NotUsed]): Source[HelloReply, NotUsed] =
    ???

  override def itKeepsTalking(in: Source[HelloRequest, NotUsed]): Future[HelloReply] =
    ???

  override def itKeepsReplying(in: HelloRequest): Source[HelloReply, NotUsed] =
    ???
