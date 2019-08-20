package com.worldwarofants.game.examplefeature.arch;

import com.worldwarofants.game.base.AbstractModule;
import com.worldwarofants.game.model.World;

public class ExampleModule extends AbstractModule<ExampleCommandHandler> {

    public ExampleModule(World world) {
        super(world);
    }

    @Override
    protected ExampleCommandHandler initDependencies() {
        ExampleViewModel viewModel = new ExampleViewModel();
        ExampleView view = new ExampleView(viewModel);
        ExampleController controller = new ExampleController(view, world);
        ExampleCommandHandler handler = new ExampleCommandHandler(controller);
        return handler;
    }
}
