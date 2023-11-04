/*
 * Copyright 2021-2023 Boyan Georgiev
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

package com.github.chaosfirebolt.generator.identifier.string.impl;

import com.github.chaosfirebolt.generator.identifier.string.StringIdentifierGenerator;
import com.github.chaosfirebolt.generator.identifier.string.rule.AnyCharacterGeneratorRule;
import com.github.chaosfirebolt.generator.identifier.string.validation.RuleValidator;

import java.util.Random;

/**
 * Implementation generating identifiers consisting of alphanumeric and special characters.
 * <br>
 * Created by ChaosFire on 18-Dec-21
 */
@Deprecated(forRemoval = true)
public class AnyCharacterIdentifierGenerator extends StringIdentifierGenerator {

    /**
     * Constructs new instance of identifier generator, with desired lengths for lower case, upper case, special and numeric characters.
     * @param lowerCaseLength length of lower case characters
     * @param upperCaseLength length of upper case characters
     * @param numericLength length of numeric characters
     * @param specialCharLength length of special characters
     * @throws IllegalArgumentException if any of the length parameters is negative or zero, the underlying Part constructors will throw this exception
     */
    public AnyCharacterIdentifierGenerator(int lowerCaseLength, int upperCaseLength, int numericLength, int specialCharLength) {
        super(new AnyCharacterGeneratorRule(lowerCaseLength, upperCaseLength, numericLength, specialCharLength));
    }

    /**
     * Constructs new instance of identifier generator, with desired lengths for lower case, upper case, special and numeric characters, and provided validators.
     *
     * @param lowerCaseLength   length of lower case characters
     * @param upperCaseLength   length of upper case characters
     * @param numericLength     length of numeric characters
     * @param specialCharLength length of special characters
     * @param ruleValidator     validators for the rule
     * @throws IllegalArgumentException if any of the length parameters is negative or zero, the underlying Part constructors will throw this exception
     */
    public AnyCharacterIdentifierGenerator(int lowerCaseLength, int upperCaseLength, int numericLength, int specialCharLength, RuleValidator ruleValidator) {
        super(new AnyCharacterGeneratorRule(lowerCaseLength, upperCaseLength, numericLength, specialCharLength), ruleValidator);
    }

    /**
     * Constructs new instance of identifier generator, with desired lengths for lower case, upper case, special and numeric characters, provided validators and random.
     *
     * @param random            random number generator
     * @param lowerCaseLength   length of lower case characters
     * @param upperCaseLength   length of upper case characters
     * @param numericLength     length of numeric characters
     * @param specialCharLength length of special characters
     * @param ruleValidator     validators for the rule
     * @throws IllegalArgumentException if any of the length parameters is negative or zero, the underlying Part constructors will throw this exception
     */
    public AnyCharacterIdentifierGenerator(Random random, int lowerCaseLength, int upperCaseLength, int numericLength, int specialCharLength, RuleValidator ruleValidator) {
        super(random, new AnyCharacterGeneratorRule(lowerCaseLength, upperCaseLength, numericLength, specialCharLength), ruleValidator);
    }
}
