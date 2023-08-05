/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * license agreements; and to You under the Apache License, version 2.0:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is part of the Apache Pekko project, which was derived from Akka.
 */

package helloworld;

import java.util.concurrent.CompletionStage;
import org.apache.pekko.NotUsed;
import org.apache.pekko.stream.javadsl.Source;
import helloworld.Helloworld.*;

class GreeterServiceImpl implements GreeterService {
  public CompletionStage<HelloReply> sayHello(HelloRequest request) {
    throw new UnsupportedOperationException();
  }
  public CompletionStage<HelloReply> sayHelloA(a.Other.HelloRequest request) {
    throw new UnsupportedOperationException();
  }
  public CompletionStage<HelloReply> sayHelloB(b.Other.HelloRequest request) {
    throw new UnsupportedOperationException();
  }
}
