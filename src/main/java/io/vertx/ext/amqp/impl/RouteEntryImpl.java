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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class RouteEntryImpl implements RouteEntry
{
    Pattern _pattern;

    List<String> _addressList = new ArrayList<String>();

    RouteEntryImpl(Pattern p, String addr)
    {
        _pattern = p;
        _addressList.add(addr);
    }

    @Override
    public void add(String addr)
    {
        _addressList.add(addr);
    }

    @Override
    public void remove(String addr)
    {
        _addressList.remove(addr);
    }

    @Override
    public Pattern getPattern()
    {
        return _pattern;
    }

    @Override
    public List<String> getAddressList()
    {
        return _addressList;
    }
}