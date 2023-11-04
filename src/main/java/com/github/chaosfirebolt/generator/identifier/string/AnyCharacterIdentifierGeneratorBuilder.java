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

package com.github.chaosfirebolt.generator.identifier.string;

import com.github.chaosfirebolt.generator.identifier.string.part.Part;

import java.util.List;
import java.util.OptionalInt;

public final class AnyCharacterIdentifierGeneratorBuilder extends TypeSpecificStringIdentifierBuilder<AnyCharacterIdentifierGeneratorBuilder>
        implements LowerAlphabeticGeneratorBuilder<AnyCharacterIdentifierGeneratorBuilder>, UpperCaseAlphabeticBuilder<AnyCharacterIdentifierGeneratorBuilder>,
        NumericGeneratorBuilder<AnyCharacterIdentifierGeneratorBuilder>, SpecialGeneratorBuilder<AnyCharacterIdentifierGeneratorBuilder> {

    private int lowerCaseLength;
    private int minLowerCaseLength;
    private int upperCaseLength;
    private int minUpperCaseLength;
    private int numericLength;
    private int minNumericLength;
    private int specialCharacterLength;
    private int minSpecialCharacterLength;

    AnyCharacterIdentifierGeneratorBuilder() {
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setLowerCaseLength(int lowerCaseLength) {
        this.lowerCaseLength = lowerCaseLength;
        return this;
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setMinLowerCaseLength(int minLowerCaseLength) {
        this.minLowerCaseLength = minLowerCaseLength;
        return this;
    }

    @Override
    public int getLowerCaseLength() {
        return this.lowerCaseLength;
    }

    @Override
    public OptionalInt getMinLowerCaseLength() {
        return this.minLowerCaseLength < 1 ? OptionalInt.empty() : OptionalInt.of(this.minLowerCaseLength);
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setNumericLength(int numericLength) {
        this.numericLength = numericLength;
        return this;
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setMinNumericLength(int minNumericLength) {
        this.minNumericLength = minNumericLength;
        return this;
    }

    @Override
    public int getNumericLength() {
        return this.numericLength;
    }

    @Override
    public OptionalInt getMinNumericLength() {
        return this.minNumericLength < 1 ? OptionalInt.empty() : OptionalInt.of(this.minNumericLength);
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setSpecialCharacterLength(int specialCharacterLength) {
        this.specialCharacterLength = specialCharacterLength;
        return this;
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setMinSpecialCharacterLength(int minSpecialCharacterLength) {
        this.minSpecialCharacterLength = minSpecialCharacterLength;
        return this;
    }

    @Override
    public int getSpecialCharacterLength() {
        return this.specialCharacterLength;
    }

    @Override
    public OptionalInt getMinSpecialCharacterLength() {
        return this.minSpecialCharacterLength < 1 ? OptionalInt.empty() : OptionalInt.of(this.minSpecialCharacterLength);
    }

    @Override
    List<Part> getParts() {
        return List.of(createLowerAlphabeticPart(), createUpperAlphabeticPart(), createNumericPart(), createSpecialCharacterPart());
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setUpperCaseLength(int upperCaseLength) {
        this.upperCaseLength = upperCaseLength;
        return this;
    }

    @Override
    public AnyCharacterIdentifierGeneratorBuilder setMinUpperCaseLength(int minUpperCaseLength) {
        this.minUpperCaseLength = minUpperCaseLength;
        return this;
    }

    @Override
    public int getUpperCaseLength() {
        return this.upperCaseLength;
    }

    @Override
    public OptionalInt getMinUpperCaseLength() {
        return this.minUpperCaseLength < 1 ? OptionalInt.empty() : OptionalInt.of(this.minUpperCaseLength);
    }
}
