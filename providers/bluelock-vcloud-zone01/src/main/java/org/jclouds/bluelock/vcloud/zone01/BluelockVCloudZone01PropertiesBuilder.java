/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
package org.jclouds.bluelock.vcloud.zone01;

import static org.jclouds.Constants.*;
import static org.jclouds.Constants.PROPERTY_ISO3166_CODES;
import static org.jclouds.vcloud.reference.VCloudConstants.PROPERTY_VCLOUD_DEFAULT_NETWORK;

import java.util.Properties;

import org.jclouds.vcloud.VCloudPropertiesBuilder;

/**
 * Builds properties used in bluelock VCloud Clients
 * 
 * @author Adrian Cole
 */
public class BluelockVCloudZone01PropertiesBuilder extends VCloudPropertiesBuilder {
   @Override
   protected Properties defaultProperties() {
      Properties properties = super.defaultProperties();
      properties.setProperty(PROPERTY_ISO3166_CODES, "US-IN");
      properties.setProperty(PROPERTY_ENDPOINT, "https://zone01.bluelock.com/api");
      properties.setProperty(PROPERTY_BUILD_VERSION, "1.0.0.285979");
      properties.setProperty(PROPERTY_VCLOUD_DEFAULT_NETWORK, "internet01-.*");
      return properties;
   }

   public BluelockVCloudZone01PropertiesBuilder(Properties properties) {
      super(properties);
   }
}
