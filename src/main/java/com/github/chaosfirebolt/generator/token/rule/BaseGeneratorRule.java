package com.github.chaosfirebolt.generator.token.rule;

import com.github.chaosfirebolt.generator.token.part.TokenPart;
import com.github.chaosfirebolt.generator.token.util.CalculationUtility;

import java.util.Collections;
import java.util.List;

/**
 * Basic implementation of {@link GeneratorRule}
 * <br/>
 * Created by ChaosFire on 12/5/2021
 */
public class BaseGeneratorRule implements GeneratorRule {

    /**
     * List of token parts for this rule.
     */
    private final List<TokenPart> parts;
    /**
     * Length of the token to be generated by this rule.
     */
    private final int length;

    /**
     * Constructor creating rule for token generation with supplied token parts and total length
     * @param parts parts for this rule
     * @param length required length of the token
     */
    public BaseGeneratorRule(List<TokenPart> parts, int length) {
        this.parts = Collections.unmodifiableList(parts);
        this.length = length;
    }

    /**
     * Constructor creating rule for token generation with supplied token parts
     * @param parts parts for this rule
     */
    public BaseGeneratorRule(List<TokenPart> parts) {
        this(parts, CalculationUtility.totalLength(parts));
    }

    @Override
    public List<TokenPart> getParts() {
        return this.parts;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}