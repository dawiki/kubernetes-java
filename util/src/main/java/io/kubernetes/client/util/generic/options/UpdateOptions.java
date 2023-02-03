/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util.generic.options;

public class UpdateOptions {
  private String dryRun;
  private String fieldManager;

  public UpdateOptions dryRun(String dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public String getDryRun() {
    return dryRun;
  }

  public void setDryRun(String dryRun) {
    this.dryRun = dryRun;
  }

  public UpdateOptions fieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
    return this;
  }

  public String getFieldManager() {
    return fieldManager;
  }

  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }
}
