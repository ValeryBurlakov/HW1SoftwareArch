package InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Flash;
import ModelElements.Camera;
import ModelElements.Scene;


import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changedObserver;

    public ModelStore(List<PoligonalModel> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras,
                      List<IModelChangedObserver> changeObservers) throws Exception {
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }


    public Scene getScene(int id) {
        return scenes.stream()
                .filter(scene -> scene.id == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
