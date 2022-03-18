package org.apache.maven.lifecycle.providers.packaging;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * {@code jar} packaging plugins bindings provider for {@code default} lifecycle.
 */
@Named( "jar" )
@Singleton
public final class JarLifecycleMappingProvider
    extends AbstractLifecycleMappingProvider
{
    // START SNIPPET: jar
    private static final String[] BINDINGS =
    {
        "process-resources",      "org.apache.maven.plugins:maven-resources-plugin:3.2.0:resources",
        "compile",                "org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile",
        "process-test-resources", "org.apache.maven.plugins:maven-resources-plugin:3.2.0:testResources",
        "test-compile",           "org.apache.maven.plugins:maven-compiler-plugin:3.8.1:testCompile",
        "test",                   "org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M5:test",
        "package",                "org.apache.maven.plugins:maven-jar-plugin:3.2.0:jar",
        "install",                "org.apache.maven.plugins:maven-install-plugin:3.0.0-M1:install",
        "deploy",                 "org.apache.maven.plugins:maven-deploy-plugin:3.0.0-M1:deploy"
    };
    // END SNIPPET: jar
    
    @Inject
    public JarLifecycleMappingProvider()
    {
        super( BINDINGS );
    }
}
