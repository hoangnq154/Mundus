/*
 * Copyright (c) 2015. See AUTHORS file.
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

package com.mbrlabs.mundus.ui.components.menu;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.kotcrab.vis.ui.widget.Menu;
import com.kotcrab.vis.ui.widget.MenuItem;
import com.mbrlabs.mundus.ui.Ui;

/**
 * @author Marcus Brummer
 * @version 20-12-2015
 */
public class EnvironmentMenu extends Menu {

    private MenuItem addLight;
    private MenuItem fog;

    public EnvironmentMenu() {
        super("Environment");

        addLight = new MenuItem("Add Light");
        fog = new MenuItem("Fog");

        addItem(addLight);
        addItem(fog);

        setupListeners();
    }

    private void setupListeners() {
        fog.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Ui.getInstance().showDialog(Ui.getInstance().getFogDialog());
            }
        });
    }

    public MenuItem getAddLight() {
        return addLight;
    }

    public MenuItem getFog() {
        return fog;
    }
}

