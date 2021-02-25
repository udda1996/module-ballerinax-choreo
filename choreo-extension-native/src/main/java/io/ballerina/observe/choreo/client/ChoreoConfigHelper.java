/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.observe.choreo.client;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Manages Choreo tracing extension's configs in local machine.
 *
 * @since 2.0.0
 */
public class ChoreoConfigHelper {
    private ChoreoConfigHelper() {  // Prevent initialization
    }

    public static Path getGlobalChoreoConfigDir() {
        final String userHome = System.getProperty("user.home");
        return Paths.get(userHome + File.separator + ".config" + File.separator + "choreo");
    }
}
