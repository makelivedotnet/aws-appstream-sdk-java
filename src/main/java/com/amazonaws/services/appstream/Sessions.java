/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.appstream;


import com.amazonaws.hal.Link;
import com.amazonaws.hal.ResourceInfo;
import com.amazonaws.hal.UriVariable;

import java.util.List;


public interface Sessions extends ResourceInfo {

    //-------------------------------------------------------------
    // Links
    //-------------------------------------------------------------

    @Link(relation = "session:by-id")
    Session getById(@UriVariable(name = "session_id") String sessionId);

    @Link(relation = "item")
    List<Session> getItems();
}
