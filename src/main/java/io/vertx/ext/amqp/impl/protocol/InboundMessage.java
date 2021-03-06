/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vertx.ext.amqp.impl.protocol;

public class InboundMessage extends AmqpMessageImpl {
  private String _ssnID;

  private byte[] _deliveryTag;

  private long _sequence;

  private boolean _preSettled = false;

  InboundMessage(String ssnID, byte[] deliveryTag, long sequence, boolean preSettled,
                 org.apache.qpid.proton.message.Message msg) {
    super(msg);
    _ssnID = ssnID;
    _deliveryTag = deliveryTag;
    _sequence = sequence;
  }

  @Override
  public String getMsgRef() {
    return _ssnID.concat("#").concat(String.valueOf(_sequence));
  }

  String getSessionID() {
    return _ssnID;
  }

  byte[] getDeliveryTag() {
    return _deliveryTag;
  }

  long getSequence() {
    return _sequence;
  }

  public boolean isPreSettled() {
    return _preSettled;
  }
}