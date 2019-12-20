/*
 * Copyright (c) 2017.
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

package com.itfsw.mybatis.generator.plugins.utils.enhanced;

import org.mybatis.generator.api.dom.OutputUtilities;
import org.mybatis.generator.api.dom.java.*;

import java.util.Iterator;
import java.util.Set;

import static org.mybatis.generator.api.dom.OutputUtilities.*;
import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

/**
 * ---------------------------------------------------------------------------
 * 内部接口
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/1/12 17:53
 * ---------------------------------------------------------------------------
 */
public class InnerInterface extends Interface{
    public InnerInterface(FullyQualifiedJavaType type) {
        super(type);
    }

    public InnerInterface(String type) {
        super(type);
    }

}
