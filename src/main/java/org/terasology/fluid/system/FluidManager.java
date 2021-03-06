/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.fluid.system;

import org.terasology.entitySystem.entity.EntityRef;

public interface FluidManager {
    boolean addFluid(EntityRef instigator, EntityRef container, String fluidType, float volume);

    boolean addFluid(EntityRef instigator, EntityRef container, int slot, String fluidType, float volume);

    boolean removeFluid(EntityRef instigator, EntityRef container, String fluidType, float volume);

    boolean removeFluid(EntityRef instigator, EntityRef container, int slot, String fluidType, float volume);

    float moveFluid(EntityRef instigator, EntityRef from, EntityRef to, int slotFrom, String fluidType, int slotTo, float volume);
}
