/*
 * Copyright 2020 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.streamsets.pipeline.stage.lib.kinesis;

import com.streamsets.pipeline.api.ConfigDef;
import com.streamsets.pipeline.api.ConfigDefBean;
import com.streamsets.pipeline.api.ConfigGroups;
import com.streamsets.pipeline.api.ConnectionDef;
import com.streamsets.pipeline.api.ConnectionEngine;
import com.streamsets.pipeline.api.InterfaceAudience;
import com.streamsets.pipeline.api.InterfaceStability;
import com.streamsets.pipeline.api.ValueChooserModel;
import com.streamsets.pipeline.stage.lib.aws.AWSConfig;
import com.streamsets.pipeline.stage.lib.aws.AwsRegion;
import com.streamsets.pipeline.stage.lib.aws.AwsRegionChooserValues;
import com.streamsets.pipeline.stage.lib.aws.ProxyConfig;
import com.streamsets.pipeline.stage.lib.kinesis.common.AwsKinesisConnection;

@InterfaceAudience.LimitedPrivate
@InterfaceStability.Unstable
@ConnectionDef(
    label = "Amazon Kinesis Data Stream",
    type = AwsKinesisStreamConnection.TYPE,
    description = "Connects to Amazon Kinesis Stream",
    version = 1,
    upgraderDef = "upgrader/AwsKinesisStreamConnection.yaml",
    supportedEngines = {ConnectionEngine.COLLECTOR}
)
@ConfigGroups(AwsKinesisConnectionGroups.class)
public class AwsKinesisStreamConnection extends AwsKinesisConnection {
  public static final String TYPE = "STREAMSETS_AWS_KINESIS_STREAM";
}
