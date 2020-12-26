/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.weatherManager.clouds;

import org.terasology.math.Region3i;
import org.terasology.world.block.BlockRegion;
import org.terasology.world.generation.Border3D;
import org.terasology.world.generation.facets.base.BaseBooleanFieldFacet2D;

/**
 * Defines a 2D layer of clouds.
 * @author Martin Steiger
 */
public class CloudFacet extends BaseBooleanFieldFacet2D {

    private final int height;

    public CloudFacet(int height, BlockRegion targetRegion, Border3D border) {
        super(targetRegion, border);

        this.height = height;
    }

    /**
     * @return the height of this cloud layer
     */
    public int getHeight() {
        return height;
    }
}
