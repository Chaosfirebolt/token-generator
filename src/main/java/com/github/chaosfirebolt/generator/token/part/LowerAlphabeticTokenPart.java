package com.github.chaosfirebolt.generator.token.part;

import com.github.chaosfirebolt.generator.token.util.CharacterUtility;

import java.util.List;

/**
 * Token part for lower alphabetic characters.
 * <br/>
 * Created by ChaosFire on 12/5/2021
 */
public class LowerAlphabeticTokenPart extends BaseTokenPart {

    private static final List<Character> CHARACTERS = CharacterUtility.characterListFromIntRange(97, 123);

    /**
     * Constructor creating instance of token part for lower alphabetic chars, with desired length
     * @param length required length of the part
     */
    public LowerAlphabeticTokenPart(int length) {
        super(length, CHARACTERS);
    }
}