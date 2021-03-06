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
package io.vertx.ext.amqp;

/**
 * Outgoing message-delivery state
 */
public enum DeliveryState {
  /**
   * Message has been settled by the remote peer.
   */
  SETTLED,

  /**
   * Delivery is still pending and the state is not known.
   */
  UNKNOWN,

  /**
   * The link has failed due to the underlying network connection failure. The
   * message associated with this delivery is in-doubt.
   */
  LINK_FAILED
}