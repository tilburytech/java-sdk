/****************************************************************************
 * Copyright 2019, Optimizely, Inc. and contributors                        *
 *                                                                          *
 * Licensed under the Apache License, Version 2.0 (the "License");          *
 * you may not use this file except in compliance with the License.         *
 * You may obtain a copy of the License at                                  *
 *                                                                          *
 *    http://www.apache.org/licenses/LICENSE-2.0                            *
 *                                                                          *
 * Unless required by applicable law or agreed to in writing, software      *
 * distributed under the License is distributed on an "AS IS" BASIS,        *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. *
 * See the License for the specific language governing permissions and      *
 * limitations under the License.                                           *
 ***************************************************************************/
package com.optimizely.ab.decision.entities;

public enum Reason {
    // BucketedIntoVariation - the user is bucketed into a variation for the given experiment
    BucketedIntoVariation("Bucketed into variation"),
    // NotBucketedIntoVariation - the user is not bucketed into a variation for the given experiment
    NotBucketedIntoVariation("Not bucketed into a variation"),
    // FailedToMeetExperimentConditions - the user does not meet conditions for the given experiment
    FailedToMeetExperimentConditions("User does not meet conditions to be in experiment");

    private String reason;

    Reason(String reason) {
        this.reason = reason;
    }

    public String toString() {
        return reason;
    }
}