# vlingo-http

[![Build Status](https://travis-ci.org/vlingo/vlingo-http.svg?branch=master)](https://travis-ci.org/vlingo/vlingo-http)

Reactive, scalable, and resilient HTTP servers and RESTful services running on vlingo/cluster and vlingo/actors.

1. The essential features are completed
  * Fully actor-based asynchronous requests and responses.
  * The request handling is resource based.
  * Requests that require message body content are auto-mapped to simple Java objects.
2. To run the Server:
  * [Use Server#startWith() to start the Server actor](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/resource/Server.java)
  * The light-weight Server is meant to be run inside vlingo/cluster nodes the require RESTful HTTP support.
3. See the following for usage examples:
  * [vlingo/http properties file](https://github.com/vlingo/vlingo-http/blob/master/src/test/resources/vlingo-http.properties)
  * [The user resource sample](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/sample/user/UserResource.java)
  * [The user profile resource sample](https://github.com/vlingo/vlingo-http/blob/master/src/main/java/io/vlingo/http/sample/user/ProfileResource.java)


License (See LICENSE file for full license)
-------------------------------------------
Copyright © 2012-2018 Vaughn Vernon. All rights reserved.

This Source Code Form is subject to the terms of the
Mozilla Public License, v. 2.0. If a copy of the MPL
was not distributed with this file, You can obtain
one at https://mozilla.org/MPL/2.0/.
