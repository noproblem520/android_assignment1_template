/*
* Copyright (C) 2021 The Android Open Source Project.
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
package com.example.assignment1_template.data

import com.example.assignment1_template.R
import com.example.assignment1_template.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.choco,
            "CHOCO",
            2,
            "stealing socks",
            "Hi! My name is CHOCO. Great to see you."
        ),
        Dog(
            R.drawable.micky,
            "MICKY",
            8,
            "Digging in the garden",
            "Hi! My name is MICKY. Great to see you."
        ),
        Dog(
            R.drawable.hero,
            "Hero",
            10,
            "Chasing sea foam",
            "Hi! My name is Hero. Great to see you."
        )
    )
}
