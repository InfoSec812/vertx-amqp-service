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
package io.vertx.ext.amqp.impl;

import io.vertx.ext.amqp.impl.config.ConfigRouteEntry;
import io.vertx.ext.amqp.impl.routing.InboundRoutingPropertyType;

import java.util.List;
import java.util.Map;

public interface AmqpServiceConfig {
  public String getInboundHost();

  public int getInboundPort();

  public String getDefaultHandlerAddress();

  public String getDefaultOutboundAddress();

  public List<String> getHandlerAddressList();

  public boolean isUseCustomPropertyForOutbound();

  public String getOutboundRoutingPropertyName();

  public Map<String, ConfigRouteEntry> getOutboundRoutes();

  public String getInboundRoutingPropertyName();

  public String getDefaultInboundAddress();

  public InboundRoutingPropertyType getInboundRoutingPropertyType();

  public Map<String, ConfigRouteEntry> getInboundRoutes();

  public int getMaxedCachedURLEntries();

  public int getDefaultLinkCredit();
}