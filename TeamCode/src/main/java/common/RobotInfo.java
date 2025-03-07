/*
 * Copyright (c) 2019 Titan Robotics Club (http://www.titanrobotics.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package common;

public class RobotInfo
{
    //
    // Game element distances: all referenced as red alliance.
    //
    public static final double ROBOT_START_X_WALL               = 32.0;
    public static final double ROBOT_START_X_MID                = 45.0;
    public static final double ROBOT_START_X_FAR                = 52.0;
    public static final double ROBOT_START_Y                    = 9.0;
    public static final double ABS_LEFT_STONE_WALL_X            = -(ROBOT_START_X_WALL - 12.0);
    public static final double ABS_LEFT_STONE_FAR_X             = -(ROBOT_START_X_FAR - 7.0);
    public static final double SKYSTONE_SCAN_DISTANCE_WALL      = -9.0;
    public static final double SKYSTONE_SCAN_DISTANCE_FAR       = -18.0;

    // Absolute position waypoint coordinates
    public static final double ABS_FOUNDATION_DROP_FAR_X        = 128.0;
    public static final double ABS_FOUNDATION_DROP_MID_X        = 120.0;
    public static final double ABS_FOUNDATION_DROP_NEAR_X       = 112.0;
    public static final double ABS_NEXT_TO_PARTNER_PARK_X       = 86.0;
    public static final double ABS_CENTER_BRIDGE_PARK_Y         = 32.0;
    public static final double ABS_UNDER_BRIDGE_PARK_X          = 63.0;

}   //class RobotInfo
