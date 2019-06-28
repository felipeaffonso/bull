/**
 * Copyright (C) 2019 Expedia, Inc.
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

package com.hotels.beans.conversion.processor.impl;

import java.util.function.Function;

import com.hotels.beans.conversion.processor.ConversionProcessor;

/**
 * Provides all method for converting any primitive type to a {@link Character}.
 */
public final class CharacterConversionProcessor implements ConversionProcessor {

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Byte, Character> convertByte() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Short, Character> convertShort() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Integer, Character> convertInteger() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Long, Character> convertLong() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Float, Character> convertFloat() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Double, Character> convertDouble() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Character, Character> convertCharacter() {
        return val -> val;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<Boolean, Character> convertBoolean() {
        return val -> val.toString().charAt(0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Function<String, Character> convertString() {
        return val -> val.charAt(0);
    }
}