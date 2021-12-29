/*
 * Copyright 2021 Boyan Georgiev
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

package com.github.chaosfirebolt.generator.identifier.rule;

import com.github.chaosfirebolt.generator.identifier.part.Part;
import com.github.chaosfirebolt.generator.identifier.util.CalculationUtility;

import java.util.Collections;
import java.util.List;

/**
 * Basic implementation of {@link GeneratorRule}
 * <br>
 * Created by ChaosFire on 12/5/2021
 */
public class BaseGeneratorRule implements GeneratorRule {

    /**
     * List of identifier parts for this rule.
     */
    private final List<Part> parts;

    /**
     * Length of the identifier to be generated by this rule.
     */
    private final int length;

    /**
     * Minimum length of the identifier to be generated by this rule.
     */
    private final int minLength;

    /**
     * Constructor creating rule for identifier generation with supplied identifier parts
     * @param parts parts for this rule
     */
    public BaseGeneratorRule(List<Part> parts) {
        this(parts, CalculationUtility.totalLength(parts), CalculationUtility.minimumLength(parts));
    }

    private BaseGeneratorRule(List<Part> parts, int length, int minLength) {
        this.parts = Collections.unmodifiableList(parts);
        this.length = length;
        this.minLength = minLength;
    }

    @Override
    public List<Part> getParts() {
        return this.parts;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getMinLength() {
        return this.minLength;
    }
}