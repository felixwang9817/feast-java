/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright 2018-2021 The Feast Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package feast.serving.specs;

import com.google.protobuf.Duration;
import feast.proto.core.FeatureProto;
import feast.proto.serving.ServingAPIProto;
import java.util.List;

public interface FeatureSpecRetriever {

  Duration getMaxAge(String projectName, ServingAPIProto.FeatureReferenceV2 featureReference);

  List<String> getEntitiesList(
      String projectName, ServingAPIProto.FeatureReferenceV2 featureReference);

  FeatureProto.FeatureSpecV2 getFeatureSpec(
      String projectName, ServingAPIProto.FeatureReferenceV2 featureReference);
}
