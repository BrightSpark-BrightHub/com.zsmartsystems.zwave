/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_INDICATOR</b> version <b>2</b>.<br>
 * <p>
 * Command Class Indicator<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassIndicatorV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassIndicatorV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_INDICATOR
     */
    public final static int COMMAND_CLASS_KEY = 0x87;

    /**
     * Indicator Set Command Constant
     */
    public final static int INDICATOR_SET = 0x01;
    /**
     * Indicator Get Command Constant
     */
    public final static int INDICATOR_GET = 0x02;
    /**
     * Indicator Report Command Constant
     */
    public final static int INDICATOR_REPORT = 0x03;
    /**
     * Indicator Supported Get Command Constant
     */
    public final static int INDICATOR_SUPPORTED_GET = 0x04;
    /**
     * Indicator Supported Report Command Constant
     */
    public final static int INDICATOR_SUPPORTED_REPORT = 0x05;

    // Constants for Next Indicator ID
    private static Map<Integer, String> constantNextIndicatorId = new HashMap<Integer, String>();
    // Constants for Property ID
    private static Map<Integer, String> constantPropertyId = new HashMap<Integer, String>();
    // Constants for Indicator ID
    private static Map<Integer, String> constantIndicatorId = new HashMap<Integer, String>();

    static {
        // Constants for Next Indicator ID
        constantNextIndicatorId.put(0x00, "NA");
        constantNextIndicatorId.put(0x44, "BUTTON2_INDICATION");
        constantNextIndicatorId.put(0x01, "ARMED");
        constantNextIndicatorId.put(0x45, "BUTTON3_INDICATION");
        constantNextIndicatorId.put(0x02, "NOT_ARMED");
        constantNextIndicatorId.put(0x46, "BUTTON4_INDICATION");
        constantNextIndicatorId.put(0x47, "BUTTON5_INDICATION");
        constantNextIndicatorId.put(0x03, "READY");
        constantNextIndicatorId.put(0x04, "FAULT");
        constantNextIndicatorId.put(0x40, "BUTTON_BACKLIGHT_LETTERS");
        constantNextIndicatorId.put(0x05, "BUSY");
        constantNextIndicatorId.put(0x41, "BUTTON_BACKLIGHT_DIGITS");
        constantNextIndicatorId.put(0x06, "ENTER_ID");
        constantNextIndicatorId.put(0x42, "BUTTON_BACKLIGHT_COMMAND");
        constantNextIndicatorId.put(0x07, "ENTER_PIN");
        constantNextIndicatorId.put(0x43, "BUTTON1_INDICATION");
        constantNextIndicatorId.put(0x4C, "BUTTON10_INDICATION");
        constantNextIndicatorId.put(0x08, "OK");
        constantNextIndicatorId.put(0x4D, "BUTTON11_INDICATION");
        constantNextIndicatorId.put(0x09, "NOT_OK");
        constantNextIndicatorId.put(0x4E, "BUTTON12_INDICATION");
        constantNextIndicatorId.put(0x48, "BUTTON6_INDICATION");
        constantNextIndicatorId.put(0x49, "BUTTON7_INDICATION");
        constantNextIndicatorId.put(0x4A, "BUTTON8_INDICATION");
        constantNextIndicatorId.put(0x4B, "BUTTON9_INDICATION");
        constantNextIndicatorId.put(0x22, "ZONE3_ARMED");
        constantNextIndicatorId.put(0x23, "ZONE4_ARMED");
        constantNextIndicatorId.put(0x20, "ZONE1_ARMED");
        constantNextIndicatorId.put(0x21, "ZONE2_ARMED");
        constantNextIndicatorId.put(0x24, "ZONE5_ARMED");
        constantNextIndicatorId.put(0x25, "ZONE6_ARMED");
        constantNextIndicatorId.put(0x30, "LCD_BACKLIGHT");
        constantNextIndicatorId.put(0xF0, "BUZZER");
        // Constants for Property ID
        constantPropertyId.put(0x10, "LOW_POWER");
        constantPropertyId.put(0x01, "MULTILEVEL");
        constantPropertyId.put(0x02, "BINARY");
        constantPropertyId.put(0x03, "ON_OFF_PERIOD");
        constantPropertyId.put(0x04, "ON_OFF_CYCLES");
        // Constants for Indicator ID
        constantIndicatorId.put(0x00, "NA");
        constantIndicatorId.put(0x44, "BUTTON2_INDICATION");
        constantIndicatorId.put(0x01, "ARMED");
        constantIndicatorId.put(0x45, "BUTTON3_INDICATION");
        constantIndicatorId.put(0x02, "NOT_ARMED");
        constantIndicatorId.put(0x46, "BUTTON4_INDICATION");
        constantIndicatorId.put(0x47, "BUTTON5_INDICATION");
        constantIndicatorId.put(0x03, "READY");
        constantIndicatorId.put(0x04, "FAULT");
        constantIndicatorId.put(0x40, "BUTTON_BACKLIGHT_LETTERS");
        constantIndicatorId.put(0x05, "BUSY");
        constantIndicatorId.put(0x41, "BUTTON_BACKLIGHT_DIGITS");
        constantIndicatorId.put(0x06, "ENTER_ID");
        constantIndicatorId.put(0x42, "BUTTON_BACKLIGHT_COMMAND");
        constantIndicatorId.put(0x07, "ENTER_PIN");
        constantIndicatorId.put(0x43, "BUTTON1_INDICATION");
        constantIndicatorId.put(0x4C, "BUTTON10_INDICATION");
        constantIndicatorId.put(0x08, "OK");
        constantIndicatorId.put(0x4D, "BUTTON11_INDICATION");
        constantIndicatorId.put(0x09, "NOT_OK");
        constantIndicatorId.put(0x4E, "BUTTON12_INDICATION");
        constantIndicatorId.put(0x48, "BUTTON6_INDICATION");
        constantIndicatorId.put(0x49, "BUTTON7_INDICATION");
        constantIndicatorId.put(0x4A, "BUTTON8_INDICATION");
        constantIndicatorId.put(0x4B, "BUTTON9_INDICATION");
        constantIndicatorId.put(0x22, "ZONE3_ARMED");
        constantIndicatorId.put(0x23, "ZONE4_ARMED");
        constantIndicatorId.put(0x20, "ZONE1_ARMED");
        constantIndicatorId.put(0x21, "ZONE2_ARMED");
        constantIndicatorId.put(0x24, "ZONE5_ARMED");
        constantIndicatorId.put(0x25, "ZONE6_ARMED");
        constantIndicatorId.put(0x30, "LCD_BACKLIGHT");
        constantIndicatorId.put(0xF0, "BUZZER");
    }

    /**
     * Creates a new message with the INDICATOR_SET command.<br>
     * <p>
     * Indicator Set<br>
     *
     * @param indicator0Value {@link Integer}
     * @param indicatorObjectCount {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorSet(Integer indicator0Value, Integer indicatorObjectCount) {
        logger.debug("Creating command message INDICATOR_SET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_SET);

        // Process 'Indicator 0 Value'
        outputData.write(indicator0Value);

        // Process 'Properties1'
        outputData.write(indicatorObjectCount & 0x1F);

        // Process 'vg1'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_SET command<br>
     * <p>
     * Indicator Set<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>INDICATOR_0_VALUE {@link Integer}
     * <li>INDICATOR_OBJECT_COUNT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Indicator 0 Value'
        switch ((int) payload[2]) {
            case 0x00:
                response.put("INDICATOR_0_VALUE", "OFF_DISABLE");
                break;
            case 0xFF:
                response.put("INDICATOR_0_VALUE", "ON_ENABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Process 'Properties1'
        response.put("INDICATOR_OBJECT_COUNT", Integer.valueOf(payload[3] & 0x1F));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 4;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Indicator ID'
            constantIndicatorId.get((int) payload[4]);

            // Process 'Property ID'
            constantPropertyId.get((int) payload[5]);

            // Process 'Value'
            variant.put("VALUE", Integer.valueOf(payload[6]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 1] & 0x1F) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_GET command.<br>
     * <p>
     * Indicator Get<br>
     *
     * @param indicatorId {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorGet(String indicatorId) {
        logger.debug("Creating command message INDICATOR_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_GET);

        // Process 'Indicator ID'
        for (Integer entry : constantIndicatorId.keySet()) {
            if (constantIndicatorId.get(entry).equals(indicatorId)) {
                outputData.write(entry);
                break;
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_GET command<br>
     * <p>
     * Indicator Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>INDICATOR_ID {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Indicator ID'
        constantIndicatorId.get((int) payload[2]);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_REPORT command.<br>
     * <p>
     * Indicator Report<br>
     *
     * @param indicator0Value {@link Integer}
     * @param indicatorObjectCount {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorReport(Integer indicator0Value, Integer indicatorObjectCount) {
        logger.debug("Creating command message INDICATOR_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_REPORT);

        // Process 'Indicator 0 Value'
        outputData.write(indicator0Value);

        // Process 'Properties1'
        outputData.write(indicatorObjectCount & 0x1F);

        // Process 'vg1'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_REPORT command<br>
     * <p>
     * Indicator Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>INDICATOR_0_VALUE {@link Integer}
     * <li>INDICATOR_OBJECT_COUNT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Indicator 0 Value'
        switch ((int) payload[2]) {
            case 0x00:
                response.put("INDICATOR_0_VALUE", "OFF_DISABLE");
                break;
            case 0xFF:
                response.put("INDICATOR_0_VALUE", "ON_ENABLE");
                break;
            default:
                logger.debug("");
                break;
        }

        // Process 'Properties1'
        response.put("INDICATOR_OBJECT_COUNT", Integer.valueOf(payload[3] & 0x1F));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 4;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Indicator ID'
            constantIndicatorId.get((int) payload[4]);

            // Process 'Property ID'
            constantPropertyId.get((int) payload[5]);

            // Process 'Value'
            variant.put("VALUE", Integer.valueOf(payload[6]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 1] & 0x1F) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_SUPPORTED_GET command.<br>
     * <p>
     * Indicator Supported Get<br>
     *
     * @param indicatorId {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorSupportedGet(String indicatorId) {
        logger.debug("Creating command message INDICATOR_SUPPORTED_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_SUPPORTED_GET);

        // Process 'Indicator ID'
        for (Integer entry : constantIndicatorId.keySet()) {
            if (constantIndicatorId.get(entry).equals(indicatorId)) {
                outputData.write(entry);
                break;
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_SUPPORTED_GET command<br>
     * <p>
     * Indicator Supported Get<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>INDICATOR_ID {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Indicator ID'
        constantIndicatorId.get((int) payload[2]);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the INDICATOR_SUPPORTED_REPORT command.<br>
     * <p>
     * Indicator Supported Report<br>
     *
     * @param indicatorId {@link String}
     * @param nextIndicatorId {@link String}
     * @param propertySupportedBitMask {@link List<String>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getIndicatorSupportedReport(String indicatorId, String nextIndicatorId,
            List<String> propertySupportedBitMask) {
        logger.debug("Creating command message INDICATOR_SUPPORTED_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(INDICATOR_SUPPORTED_REPORT);

        // Process 'Indicator ID'
        for (Integer entry : constantIndicatorId.keySet()) {
            if (constantIndicatorId.get(entry).equals(indicatorId)) {
                outputData.write(entry);
                break;
            }
        }

        // Process 'Next Indicator ID'
        for (Integer entry : constantNextIndicatorId.keySet()) {
            if (constantNextIndicatorId.get(entry).equals(nextIndicatorId)) {
                outputData.write(entry);
                break;
            }
        }

        // Process 'Properties1'
        outputData.write(0);

        // Process 'Property Supported Bit Mask'
        int valPropertySupportedBitMask = 0;
        valPropertySupportedBitMask |= (propertySupportedBitMask.contains("MULTILEVEL") ? 0x02 : 0);
        valPropertySupportedBitMask |= (propertySupportedBitMask.contains("BINARY") ? 0x04 : 0);
        valPropertySupportedBitMask |= (propertySupportedBitMask.contains("ON_OFF_PERIOD") ? 0x08 : 0);
        valPropertySupportedBitMask |= (propertySupportedBitMask.contains("ON_OFF_CYCLES") ? 0x10 : 0);
        outputData.write(valPropertySupportedBitMask);
        valPropertySupportedBitMask = 0;
        valPropertySupportedBitMask |= (propertySupportedBitMask.contains("LOW_POWER") ? 0x01 : 0);
        outputData.write(valPropertySupportedBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the INDICATOR_SUPPORTED_REPORT command<br>
     * <p>
     * Indicator Supported Report<br>
     * <p>
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>INDICATOR_ID {@link String}
     * <li>NEXT_INDICATOR_ID {@link String}
     * <li>PROPERTY_SUPPORTED_BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleIndicatorSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Indicator ID'
        constantIndicatorId.get((int) payload[2]);

        // Process 'Next Indicator ID'
        constantNextIndicatorId.get((int) payload[3]);

        // Process 'Properties1'

        // Process 'Property Supported Bit Mask'
        List<String> responsePropertySupportedBitMask = new ArrayList<String>();
        int lenPropertySupportedBitMask = (payload[-2] & 0x1F) * 8;
        for (int cntPropertySupportedBitMask = 0; cntPropertySupportedBitMask < lenPropertySupportedBitMask; cntPropertySupportedBitMask++) {
            if ((payload[5 + (cntPropertySupportedBitMask / 8)] & cntPropertySupportedBitMask % 8) == 0) {
                continue;
            }
            switch (cntPropertySupportedBitMask) {
                case 0x01:
                    responsePropertySupportedBitMask.add("MULTILEVEL");
                    break;
                case 0x02:
                    responsePropertySupportedBitMask.add("BINARY");
                    break;
                case 0x03:
                    responsePropertySupportedBitMask.add("ON_OFF_PERIOD");
                    break;
                case 0x04:
                    responsePropertySupportedBitMask.add("ON_OFF_CYCLES");
                    break;
                case 0x10:
                    responsePropertySupportedBitMask.add("LOW_POWER");
                    break;
                default:
                    responsePropertySupportedBitMask.add("BITMASK_" + cntPropertySupportedBitMask);
                    break;
            }
        }
        response.put("PROPERTY_SUPPORTED_BIT_MASK", responsePropertySupportedBitMask);

        // Return the map of processed response data;
        return response;
    }

}
