/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl.loopback;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import com.zsmartsystems.zwave.commandclass.impl.CommandClassBasicWindowCoveringV1;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_BASIC_WINDOW_COVERING</b> version <b>1</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassBasicWindowCoveringV1LoopbackTest {
    /**
     * Performs an in/out test of the BASIC_WINDOW_COVERING_START_LEVEL_CHANGE command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param openClose {@link Boolean}
     */
    public static void testBasicWindowCoveringStartLevelChangeLoopback(Boolean openClose) {
        byte[] testPayload = CommandClassBasicWindowCoveringV1.getBasicWindowCoveringStartLevelChange(openClose);

        Map<String, Object> response = CommandClassBasicWindowCoveringV1.handleBasicWindowCoveringStartLevelChange(testPayload);
        assertEquals(openClose, (Boolean) response.get("OPEN_CLOSE"));
    }

}