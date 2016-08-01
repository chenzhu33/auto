/*
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests;

import com.google.auto.factory.internal.Preconditions;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated(
  value = "com.google.auto.factory.processor.AutoFactoryProcessor",
  comments = "https://github.com/google/auto/tree/master/factory"
  )
final class SimpleClassProvidedProviderDepsFactory {
  private final Provider<String> providedDepAProvider;
  private final Provider<String> providedDepBProvider;

  @Inject
  SimpleClassProvidedProviderDepsFactory(
      @AQualifier Provider<String> providedDepAProvider,
      @BQualifier Provider<String> providedDepBProvider) {
    this.providedDepAProvider = Preconditions.checkNotNull(providedDepAProvider, 1);
    this.providedDepBProvider = Preconditions.checkNotNull(providedDepBProvider, 2);
  }

  SimpleClassProvidedProviderDeps create() {
    return new SimpleClassProvidedProviderDeps(providedDepAProvider, providedDepBProvider);
  }
}
