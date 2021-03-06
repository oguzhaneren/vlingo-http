// Copyright © 2012-2018 Vaughn Vernon. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.http.resource;

import io.vlingo.actors.Completes;
import io.vlingo.actors.testkit.TestUntil;
import io.vlingo.http.Response;

public class MockCompletesResponse implements Completes<Response> {
  public static TestUntil untilWith;

  public Response response;
  
  @Override
  public void with(final Response outcome) {
    this.response = outcome;
    if (untilWith != null) untilWith.happened();
  }
}
